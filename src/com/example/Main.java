package com.example;

public class Main {

    public static void main(String[] args) {

        //First call - expect new instance
        System.out.println(SingletonClass.getInstance().toString());

        //Second call - expect already existing instance
        System.out.println(SingletonClass.getInstance().toString());
        System.out.println();

        System.out.println(ThreadSafeSingletonClass.getInstance().toString());
        System.out.println(ThreadSafeSingletonClass.getInstance().toString());
        System.out.println();

        System.out.println(DoubleCheckLockingSingletonClass.getInstance().toString());
        System.out.println(DoubleCheckLockingSingletonClass.getInstance().toString());
        System.out.println();

        System.out.println(EagerInstantiatedSingletonClass.getInstance().toString());
        System.out.println(EagerInstantiatedSingletonClass.getInstance().toString());
        System.out.println();
    }
}
