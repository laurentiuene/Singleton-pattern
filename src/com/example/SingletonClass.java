package com.example;

public class SingletonClass {

    private static SingletonClass singletonClass;

    private SingletonClass() {}

    public static SingletonClass getInstance() {

        if(singletonClass == null) {
            System.out.println("Singleton class instance created!");
            singletonClass = new SingletonClass();
        }
        return singletonClass;
    }
}
