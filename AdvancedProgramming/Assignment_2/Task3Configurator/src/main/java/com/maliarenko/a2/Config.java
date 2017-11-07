package com.maliarenko.a2;

public interface Config {
    <T> Class<T> getImpl(Class<T> ifc);
}
