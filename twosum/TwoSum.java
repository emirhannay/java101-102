package com.company.twosum;

public class TwoSum {

    public static void main(String[] args) {
        int[] digits = new int[]{1, 2, 9,9,9};
        int[] array = plusOne(digits);

        String name = "Emirhan";
        System.out.println(name);


    }

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }


}