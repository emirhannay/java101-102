package com.company.primenumber;


import java.util.ArrayList;
import java.util.List;

public class PrimeNumberCalculator {

    public static void main(String[] example) {
        PrimeNumberCalculator primeNumberCalculator = new PrimeNumberCalculator();
        List<Integer> result  = primeNumberCalculator.primeNumberCalculatorUpToCertainNumber(1453);

        for (int z = 0; z < result.size(); z++) {
            System.out.println(result.get(z));
        }
    }


    //Prints prime numbers up to X.
    public List<Integer> primeNumberCalculatorUpToCertainNumber(int number) {
        if(number <= 0){
            System.out.println("Number cannot be less than zero or equals zero");
            return new ArrayList<>();
        }
        boolean isItPrime = false;
        List<Integer> list = new ArrayList<>();

        for (int i = 2; i < number; i++) {
            if (i == 2) {
                list.add(i);
            } else {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isItPrime = false;
                        break;
                    } else {
                        isItPrime = true;
                    }
                }

                if (isItPrime == true) {
                    list.add(i);
                }

            }

        }
        return list;
    }
}
