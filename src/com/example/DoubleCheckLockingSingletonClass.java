package com.example;

public class DoubleCheckLockingSingletonClass {

    private static volatile DoubleCheckLockingSingletonClass doubleCheckLockingSingletonClass;

    private DoubleCheckLockingSingletonClass() {}

    public static DoubleCheckLockingSingletonClass getInstance() {

        if(doubleCheckLockingSingletonClass == null) {

            //To make thread safe
            synchronized (DoubleCheckLockingSingletonClass.class) {

                //Checking again because multiple threads can get to the first check
                if(doubleCheckLockingSingletonClass == null) {
                    System.out.println("Instance of Double Check Locking Singleton class created!");
                    doubleCheckLockingSingletonClass = new DoubleCheckLockingSingletonClass();
                }
            }
        }
        return doubleCheckLockingSingletonClass;
    }
}
