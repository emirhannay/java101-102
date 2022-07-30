package com.company.string.stringtokenizer;

import java.util.StringTokenizer;

public class StringManipulation {

    public static void main(String[] args){
        int i = 0;
        String testString = "This,is,a,test,for,String,Tokenizer";
        StringTokenizer stringTokenizer = new StringTokenizer(testString, ",");
        while (stringTokenizer.hasMoreTokens()){
            System.out.println(stringTokenizer.nextToken());
        }



    }



}
