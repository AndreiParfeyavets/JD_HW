package com.academy.parfeyavets.lesson4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Введите целое число");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Введите целое число");
        int b = sc.nextInt();
        System.out.println("Наибольший общий делитель = " + nod(a,b));
    }

    private static int nod(int a, int b) {
        if (b == 0)
            return Math.abs(a);
        return nod(b, a % b);
    }
}
