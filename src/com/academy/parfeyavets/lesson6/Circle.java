package com.academy.parfeyavets.lesson6;

public class Circle implements Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        double s = PI*Math.pow(radius,2);
        return s;
    }

    @Override
    public double perimeter() {
        double sum = 2*PI*radius;
        return sum;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
