package com.academy.parfeyavets.lesson2;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a % 3 == 0 && a % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (a % 5 == 0) {
            System.out.println("Buzz");
        } else if (a % 3 == 0) {
            System.out.println("Fizz");
        }
    }
}
