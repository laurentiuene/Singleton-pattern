package com.example;

public class EagerInstantiatedSingletonClass {

    private static EagerInstantiatedSingletonClass eagerInstantiatedSingletonClass = new EagerInstantiatedSingletonClass();

    private EagerInstantiatedSingletonClass() {
        System.out.println("Instance of Eager Instantiated Singleton class created!");
    }

    public static EagerInstantiatedSingletonClass getInstance() {
        return eagerInstantiatedSingletonClass;
    }
}
