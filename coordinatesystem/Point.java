package com.company.coordinatesystem;

public class Point {
    private double x;
    private double y;

    public double calculateDistanceFromOrigin(){
        double distance =Math.sqrt(Math.pow(this.x,2)+Math.pow(this.y,2));
        return distance;
    }
    public Point clone(){
        Point point = new Point();
        point.setX(this.x);
        point.setY(this.y);
        return point;
    }
    public void move(double x, double y){
    this.x = this.x + x;
    this.y = this.y + y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
