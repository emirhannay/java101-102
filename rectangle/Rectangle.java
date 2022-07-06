package com.company.rectangle;

public class Rectangle {

    public static void main(String[] args){
        Rectangle rectangle = new Rectangle();
        //rectangle.filledRectangle(10,3);
        //rectangle.nonFilledRectangle(25,120);

    }

    public void filledRectangle(int height,int length) {

        boolean result = checkIsItRectangle(height,length);
        if (result == false){
            return;
        }
        for (int i = 0 ; i < height; i++){
            for (int j = 0; j < length; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void nonFilledRectangle(int height, int length){

        boolean result = checkIsItRectangle(height,length);
        if (result == false){
            return;
        }
        for(int i = 1 ; i < height; i++ ){
            if(i == 1 || i == height-1){
                for (int j = 0; j < length; j++){
                    System.out.print("*");
                }
                System.out.println();
                if(i == height-1){
                    break;
                }
            }
            System.out.print("*");
            for(int a = 2; a < length; a++){
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }

    public boolean checkIsItRectangle(int height,int length){
        if(height <= 0 || length <= 0){
            System.out.println("Rectangle's height or length cannot be 0 or less than 0");
            return false;
        }
        if(height == length){
            System.out.println("Rectangle's height and length cannot be the same because it is rectangle not a square");
            return false;
        }
            return true;
    }



}
