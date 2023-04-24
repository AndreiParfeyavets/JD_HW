package com.academy.parfeyavets.lesson3;

public class Task6 {
    public static void main(String[] args) {
        System.out.println("Введите массив чисел через пробел");
        int[] array = Task4.readConsole();
        int min = Task5.findMinimal(array);
        System.out.println("Min: " + min);
        int max = Task5.findMaximal(array);
        System.out.println("Max: " + max);
    }
}
