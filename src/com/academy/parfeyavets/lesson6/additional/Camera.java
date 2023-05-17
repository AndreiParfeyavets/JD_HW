package com.academy.parfeyavets.lesson6.additional;

public  abstract class Camera implements Technique{
    private String brand;
    public Camera() {
    }
    public Camera(String brand) {
        this.brand = brand;
    }

    @Override
    public void recordSound() {
        System.out.println(this.brand+" can record sound!");
    }

    @Override
    public void recordVideo() {
        System.out.println(this.brand+" can record video!");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
