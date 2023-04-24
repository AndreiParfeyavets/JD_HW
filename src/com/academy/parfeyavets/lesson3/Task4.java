package com.academy.parfeyavets.lesson3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Введите элементы массива через пробел");
        int [] mainArray = readConsole();
        printArray(mainArray);
        printArraySeven(mainArray);
    }

    public static int[] readConsole() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] stringScan = s.trim().split(" ");
        int[] intArray = new int[stringScan.length];
        for (int i = 0; i < stringScan.length; i++) {
            intArray[i] = Integer.valueOf(stringScan[i]);
        }
        return intArray;
    }

    public static void printArray(int[] array) {
        System.out.print("Введенный массив: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("\n");
    }

    public static void printArraySeven(int[] array) {
        System.out.print("Введенный массив без чисел, кратных 7: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 7 != 0) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
