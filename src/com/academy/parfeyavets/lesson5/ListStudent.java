package com.academy.parfeyavets.lesson5;

public class ListStudent {
    public static void CourseStudent(Student[] array, int a) { //конвеншн именования методов
        System.out.println("Список студентов " + a + " курса:");
        for (int i = 0; i <array.length; i++) {
            if(array[i].getCourse() == a) {
                System.out.println(array[i].getFullName());
            }
        }
    }
    public static void BirthStudent(Student[] array, int a) { //конвеншн именования методов
        System.out.println("После " + a + " года родились:");
        for (int i = 0; i <array.length; i++) {
            if(array[i].getYearOfBirth() > a) {
                System.out.println(array[i].getFullName());
            }
        }
    }
}
