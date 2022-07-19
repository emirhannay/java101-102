package com.company.statickeyword;

import java.util.Arrays;
import java.util.Collections;

public class StaticVariable {
    static int count;

    public StaticVariable() {
        count++;
    }

    public static void main (String args[]){
        StaticVariable staticVariable1 = new StaticVariable();
        StaticVariable staticVariable2 = new StaticVariable();
        StaticVariable staticVariable3 = new StaticVariable();
        StaticVariable staticVariable4 = new StaticVariable();

        System.out.println("Reference created from this class : "+StaticVariable.count);
    }
}
