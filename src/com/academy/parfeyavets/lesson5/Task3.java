package com.academy.parfeyavets.lesson5;

public class Task3 {
    public static void main (String[] args) {
        Student andrei = new Student(1, "Pafryavets Andrei Alekseevich", "Business", 3, "BA", 1990);
        Student german = new Student(2, "Pafryavets German Andreevich", "Business", 2, "BC", 1991);
        Student yuliya = new Student(3, "Pafryavets Yuliya Vladimirovna", "Business", 1, "AA", 1992);
        Student galina = new Student(4, "Saharchuk Galina Grigoryevna", "Business", 7, "BA", 1993);
        Student inna = new Student(5, "Shweikus Inna Georgevna", "Business", 5, "BC", 1989);
        Student viktor = new Student(6, "Sidoruk Viktor Vladimirovich", "Business", 3, "AA", 1988);
        Student aleksey = new Student(7, "Ivanov Aleksey Alekseevich", "Business", 5, "BC", 1990);
        Student sergey = new Student(8, "Petrov Sergey Olegovich", "Business", 2, "AA", 1989);
        Student darya = new Student(9, "Sidorova Darya Nikolaevna", "Business", 1, "BA", 1991);
        Student anna = new Student(10, "Polivoda Anna Viktorovna", "Business", 1, "BC", 1990);

        andrei.sayHello();

        Student[] array = new Student[10];
        array[0] = andrei;
        array[1] = german;
        array[2] = yuliya;
        array[3] = galina;
        array[4] = inna;
        array[5] = viktor;
        array[6] = aleksey;
        array[7] = sergey;
        array[8] = darya;
        array[9] = anna;

        ListStudent.CourseStudent(array, 5);
        ListStudent.BirthStudent(array, 1990);
    }

}
