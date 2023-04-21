package com.academy.parfeyavets.lesson2;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age % 100 >= 11 & age % 100 <= 14) {
            System.out.print(age + " лет");
        } else if (age % 10 == 1) {
            System.out.print(age + " год");
        } else if (age % 10 == 2 || age % 10 == 3 || age % 10 == 4) {
            System.out.print(age + " года");
        } else {
            System.out.println(age + " лет");
        }
    }
}
