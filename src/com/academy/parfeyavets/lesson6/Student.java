package com.academy.parfeyavets.lesson6;

public class Student extends Man {
    private int yearOfStudy;

    public Student(String name, int age, String sex, int weight, int yearOfStudy) {
        super(name, age, sex, weight);
        if (yearOfStudy > 0 && yearOfStudy < 7) {
            this.yearOfStudy = yearOfStudy;
        } else {
            System.out.println("Ошибка! Некорректный год обучения!");
        }
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }
}
