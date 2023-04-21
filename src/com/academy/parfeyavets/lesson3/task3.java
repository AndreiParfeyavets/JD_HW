package com.academy.parfeyavets.lesson3;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пароль:");
        int i = scanner.nextInt();
        while (i != 777) {
            System.out.println("Неверный пароль. Попробуйте еще раз.");
            i=scanner.nextInt();
        }
        System.out.println("Добро пожаловать!");
    }
}
