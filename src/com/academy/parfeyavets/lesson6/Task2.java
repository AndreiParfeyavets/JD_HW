package com.academy.parfeyavets.lesson6;

public class Task2 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2, 4);
        Circle circle = new Circle(1.5);
        Triangle triangle = new Triangle(3,6,7);

        ShapeParameterPrinter shapeParameterPrinter = new ShapeParameterPrinter();
        shapeParameterPrinter.getArea(rectangle);
        shapeParameterPrinter.getPerimeter(circle);
        shapeParameterPrinter.getAreaAndPerimeter(triangle);


    }
}
