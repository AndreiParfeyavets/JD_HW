package com.academy.parfeyavets.lesson2;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        System.out.println("Введите 1-ое число");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Введите 2-ое число");
        int b = scanner.nextInt();
        int sum = a+b;
        System.out.println("Сумма = "+sum);
        System.out.println("Сумма(16р) = "+Integer.toHexString(sum));
        System.out.println("Сумма(8р) = "+Integer.toOctalString(sum));
        System.out.println("Сумма(2) = " + Integer.toBinaryString(sum));
    }
}
