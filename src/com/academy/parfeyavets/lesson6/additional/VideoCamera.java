package com.academy.parfeyavets.lesson6.additional;

public class VideoCamera extends Camera{
    private String model;

    public VideoCamera(String brand, String model) {
        super(brand);
        this.model = model;
    }

    public void playVideo(){
        System.out.println(super.getBrand()+" "+this.model+" have display and can play video!");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
