package com.academy.parfeyavets.lesson6;

public class ShapeParameterPrinter {
    public void getArea (Shape shape){
        System.out.println("Площадь: "+shape.area());
    }
    public void getPerimeter (Shape shape){
        System.out.println("Периметр: "+shape.perimeter());
    }
    public void getAreaAndPerimeter (Shape shape){
        System.out.println("Площадь: "+shape.area()+" и периметр:"+shape.perimeter());
    }
}
