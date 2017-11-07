package com.maliarenko.a2;

import lombok.SneakyThrows;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ObjectFactory {
    private static ObjectFactory ourInstance = new ObjectFactory();
    private Config config = new JavaConfig();
    private List<ObjectConfigurator> objectConfigurators = new ArrayList<>();

    //private InjectRandomIntConfigurator objectConfigurator = new InjectRandomIntConfigurator();



    public static ObjectFactory getInstance() {
        return ourInstance;
    }

    private ObjectFactory() {
    }

    @SneakyThrows
    public <T> T createObject(Class<T> type) {
        if (type.isInterface()) {
           type =  config.getImpl(type);
        }
        T o = type.newInstance();

        for (Iterator<ObjectConfigurator> iter = objectConfigurators.listIterator(); iter.hasNext(); ) {
            ObjectConfigurator objectConfigurator = iter.next();
            o = objectConfigurator.configureObject(o);
        }

        return o;
    }

    public List<ObjectConfigurator> getObjectConfigurator() {
        return objectConfigurators;
    }

    public void setObjectConfigurator(List<ObjectConfigurator> objectConfigurators) {
        this.objectConfigurators = objectConfigurators;
    }

    public void removeObjectConfigurator(ObjectConfigurator objectConfigurator) {
        for (Iterator<ObjectConfigurator> iter = objectConfigurators.listIterator(); iter.hasNext(); ) {
            ObjectConfigurator a = iter.next();
            if (a.equals(objectConfigurator)) {
                iter.remove();
            }
        }
    }

    public ObjectFactory addObjectConfigurator(ObjectConfigurator objectConfigurator) {
        objectConfigurators.add(objectConfigurator);
        return this;
    }

}
