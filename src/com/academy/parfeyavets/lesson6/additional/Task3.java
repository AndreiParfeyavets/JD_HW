package com.academy.parfeyavets.lesson6.additional;

public class Task3 {
    public static void main(String[] args) {
        VideoCamera videoCamera = new VideoCamera("Sony","AV");
        videoCamera.recordVideo();
        videoCamera.recordSound();
        videoCamera.playVideo();

        ProfessionalVideoCamera professionalVideoCamera = new ProfessionalVideoCamera("Samsung","HQ","Pro");
        professionalVideoCamera.recordVideo();
        professionalVideoCamera.playVideo();
    }
}
