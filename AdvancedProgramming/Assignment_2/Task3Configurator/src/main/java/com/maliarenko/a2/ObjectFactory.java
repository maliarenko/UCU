package com.maliarenko.a2;

import lombok.SneakyThrows;

import java.lang.reflect.Field;
import java.util.Random;

public class ObjectFactory {
    private static ObjectFactory ourInstance = new ObjectFactory();
    private Config config = new JavaConfig();
    private ObjectConfigurator objectConfigurator = new ObjectConfigurator();



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

        return objectConfigurator.configureObject(o);
    }
}
