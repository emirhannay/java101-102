package com.company.string.stringbuffer;

public class StringBuffer {

    public static void main (String[] args){

        //buildStringWithPlus("ABC",100_000);
        buildStringWithStringBuilder("ABC",100_000);
    }

    public static void buildStringWithPlus(String string, int count){
        long start = System.currentTimeMillis();
        for (int i = 0; i < count; i ++){
            string = string + i;
        }
        long end = System.currentTimeMillis();

        System.out.println("Build time with plus : " + (end - start));
    }

    public static void buildStringWithStringBuilder(String string, int count){
        StringBuilder stringBuilder = new StringBuilder(string);
        long start = System.currentTimeMillis();
        for (int i = 0; i < count; i ++){
            stringBuilder.append(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("Build time with builder : " + (end - start));
    }
}
