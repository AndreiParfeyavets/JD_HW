package com.academy.parfeyavets.lesson6;

public class Rectangle implements Shape {
    private double sideX;
    private double sideY;

    public Rectangle(double sideX, double sideY) {
        this.sideX = sideX;
        this.sideY = sideY;
    }

    @Override
    public double area() {
        double s = sideX*sideY;
        return s;
    }

    @Override
    public double perimeter() {
        double sum = 2*(sideX+sideY);
        return sum;
    }


    public double getSideX() {
        return sideX;
    }

    public void setSideX(double sideX) {
        this.sideX = sideX;
    }

    public double getSideY() {
        return sideY;
    }

    public void setSideY(double sideY) {
        this.sideY = sideY;
    }

}
