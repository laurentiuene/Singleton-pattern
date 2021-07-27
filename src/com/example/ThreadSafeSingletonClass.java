package com.example;

public class ThreadSafeSingletonClass {

    private static ThreadSafeSingletonClass threadSafeSingletonClass;

    private ThreadSafeSingletonClass() {}

    public static synchronized ThreadSafeSingletonClass getInstance() {

        if(threadSafeSingletonClass == null) {
            System.out.println("Instance of Thread-safe Singleton class created!");
            threadSafeSingletonClass = new ThreadSafeSingletonClass();
        }
        return threadSafeSingletonClass;
    }
}
