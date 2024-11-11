package com.company.polymorphismexample;




public class MainClass {
    public static void main(String args[]) {

        Dog dog = new Dog();
        dog.MakeSound();

    }




}

class Animal {

    void MakeSound(){
        System.out.println("Make sound i am base class");
    }
}

class Dog extends Animal{

    void MakeSound(int a) {
        System.out.println("Overrided method");
    }
}

class Cat extends Animal{

}
