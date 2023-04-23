package com.academy.parfeyavets.lesson2;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        System.out.print("Введите переменную a ");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextFloat();
        System.out.print("Введите переменную b ");
        double b = scanner.nextFloat();
        System.out.print("Введите переменную c ");
        double c = scanner.nextFloat();
        if (a == 0) {
            System.out.println("Уравнение не квадратное");
        }
        else {
            double d = b * b - 4 * a * c;
            if (d == 0) {
                double x = -b * 2 * a; //выдает неверный результат
                System.out.println("Уравнение имеет 1 квадратный корень" + x);
            } else if (d > 0) {
                double x = (-b + Math.sqrt(d)) / (2 * a);
                double y = (-b - Math.sqrt(d)) / (2 * a);
                System.out.println("Уравнение имеет 2 квадратных корня: " + x + " и " + y);
            } else {
                System.out.println("Уравнение не имеет корней");
            }
        }
    }
}
