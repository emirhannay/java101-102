package com.company.singleton;

public class SingletonTest {

    public static void main(String[] args){
        Singleton x = Singleton.getInstance();
        Singleton y = Singleton.getInstance();
        Singleton z = Singleton.getInstance();
        System.out.println(x);  // this will print same heap location
        System.out.println(y);   // this will print same heap location
        System.out.println(z);  //  this will print same heap location

        if (x == y && y == z) {

            // Print statement
            System.out.println(
                    "Three objects point to the same memory location on the heap i.e, to the same object");
        }
        else {
            // Print statement
            System.out.println(
                    "Three objects DO NOT point to the same memory location on the heap");
        }
    }
}
