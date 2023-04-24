package com.academy.parfeyavets.lesson3;

public class Task5 {
    public static void main(String[] args) {
        int array[] = {9, 7, 1, 5, 8, 4};
        int minimal = findMinimal(array);
        System.out.println("Minimal: " + minimal);
        int maximal = findMaximal(array);
        System.out.println("Maximal: " + maximal);
    }

    public static int findMinimal(int[] array) {
        int min = array[0];                             // изначально min присваиваем нулевой элемент из массива
        for (int i = 1; i < array.length; i++) {        // перебираем массив с 1-ой ячейки, т.к. с 0-ой нет смысла
            if (array[i] < min) {                       // и сравниваем что меньше
                min = array[i];                         // и присваиваем меньшее в min, если условие выполняется. Так перебираются все элементы и находтися минимальное значение.
            }
        }
        return min;
    }

    public static int findMaximal(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
