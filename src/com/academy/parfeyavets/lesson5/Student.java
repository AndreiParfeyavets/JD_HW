package com.academy.parfeyavets.lesson5;

public class Student {
    private int id; //геттеры и сеттеры нужны для всех полей, даже если они не используются
    private String fullName;
    private String faculty;
    private int course;
    private String group;
    private int yearOfBirth;
    public Student(int id, String fullName, String faculty, int course, String group, int yearOfBirth) {
        this.id = id;
        this.fullName = fullName;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
        this.yearOfBirth = yearOfBirth;
        if (course < 1 || course > 5) {
            System.out.println("Неверно введен курс!");
        }
    }
    public void sayHello(){
        System.out.println("Привет. Меня зовут "+ fullName +"!");
    }
    public String getFullName() {

        return this.fullName;
    }
    public int getCourse() {

        return this.course;
    }
    public int getYearOfBirth() {

        return this.yearOfBirth;
    }

}
