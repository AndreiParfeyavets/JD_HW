package com.academy.parfeyavets.lesson2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a % 2 == 0) {
            System.out.println("Введенное число четное");
        } else {
            System.out.println("Введенное число нечетное");
        }

    }
}
