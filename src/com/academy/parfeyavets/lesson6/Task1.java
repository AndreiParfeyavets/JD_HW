package com.academy.parfeyavets.lesson6;

public class Task1 {
    public static void main(String[] args) {
        Man jack = new Man("Jack", 19, "Man", 70);
        Man jane = new Man("Jane", 20, "Woman", 55);
        Man tom = new Man("Tom", 23, "Man", 80);

        Student grogo = new Student("Grogo", 22, "Man", 78, 3);
        Student anna = new Student("Anna", 25, "Woman", 60, 6);

        System.out.println(grogo.getAge());
        System.out.println(anna.getSex());

        Man anna1 = (Man) anna;
        System.out.println(anna1.getName());
    }
}
