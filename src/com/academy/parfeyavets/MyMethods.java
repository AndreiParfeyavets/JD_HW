package com.academy.parfeyavets;

import java.util.Scanner;

public class MyMethods {
    public static int[] readConsoleToIntArray() { //Возвращает преобразованиую строку (line) чисел из консоли в массив int[] элементов
        System.out.println("Введите элементы массива через пробел");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] stringScan = s.trim().split(" ");
        int[] intArray = new int[stringScan.length];
        for (int i = 0; i < stringScan.length; i++) {
            intArray[i] = Integer.valueOf(stringScan[i]);
        }
        return intArray;
    }
}
