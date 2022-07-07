package com.company.printnumberinreverse;

import java.util.List;

public class PrintNumberInReverse {

    public static void main(String example[]){
        PrintNumberInReverse printNumberInReverse = new PrintNumberInReverse();
        printNumberInReverse.printNumberInReverse(12345);
    }

    private void printNumberInReverse(int number){
        String originalString = String.valueOf(number);
        String resultString = "";
        for(int i = originalString.length()-1; i >= 0; i--){
            resultString = resultString + originalString.charAt(i);
        }
        System.out.println(resultString);
    }
}
