package com.company.singleton;

public class Singleton {


    private static Singleton singleInstance = null;

    public String s;

    private Singleton() {
        s = "Hello I am a string part of Singleton class";
    }

    public static Singleton getInstance()
    {
        if (singleInstance == null)
            singleInstance = new Singleton();

        return singleInstance;
    }
}
