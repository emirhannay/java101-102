package com.company.fizzbuzz;

public class FizzBuzz {

    public static void main(String[] args){
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.fizzBuzz();
    }

    public void fizzBuzz(){

        for(int i = 0; i< 100; i++){
            if(i % 3 == 0 & i % 5 != 0){
                System.out.println("Fizz");
            }
            else if(i % 5 == 0 & i % 3 != 0){
                System.out.println("Buzz");
            }
            else if(i % 3 == 0 & i % 5 == 0){
                System.out.println("Fizz Buzz");
            }
            else{
                System.out.println(i);
            }

        }
    }
}
