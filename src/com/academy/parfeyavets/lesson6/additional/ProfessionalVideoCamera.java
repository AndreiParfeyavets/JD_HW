package com.academy.parfeyavets.lesson6.additional;

public class ProfessionalVideoCamera extends VideoCamera{
    private String version;

    public ProfessionalVideoCamera(String brand, String model, String version) {
        super(brand, model);
        this.version = version;
    }

    @Override
    public void recordVideo() {
        System.out.println(getBrand()+" "+getModel()+" "+this.version+" can record high quality video!");
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
