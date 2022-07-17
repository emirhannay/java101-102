package com.company.coordinatesystem;

public class PointTest {
    public static void main (String args[]){
        Point point = new Point();
        point.setX(9);
        point.setY(3);
        System.out.println(point.calculateDistanceFromOrigin());
        Point point2 = point.clone();
        System.out.println(point2.getX() +" " +point2.getY());
    }
}
