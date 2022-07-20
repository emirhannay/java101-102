package com.company.outofmemory;

import java.util.ArrayList;
import java.util.List;

public class OutOfMemory {

   List<Memory> memories = new ArrayList<>();


    public OutOfMemory() {

        for (int i = 0; i < 500000000; i++){
            Memory memory = new Memory();
            memories.add(memory);
        }

    }

    class Memory {

    }

    public static void main(String args[]){
        OutOfMemory outOfMemory = new OutOfMemory();
    }
}
