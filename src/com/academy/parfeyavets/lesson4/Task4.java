package com.academy.parfeyavets.lesson4;

import com.academy.parfeyavets.MyMethods;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] mainArray = MyMethods.readConsoleToIntArray();

        sortArray(mainArray);
        for (int i = 0; i < mainArray.length; i++) {
            System.out.print(mainArray[i]+" ");

        }
    }

    private static void sortArray(int[] array) {
        //Деление
        if (array.length == 1) {
            return;
        }
        int midIndex = array.length / 2;
        int[] leftArray = new int[midIndex];
        int[] rightArray = new int[array.length - midIndex];
        for (int i = 0; i < midIndex; i++) {
            leftArray[i] = array[i];
        }
        for (int i = midIndex; i < array.length; i++) {
            rightArray[i-midIndex] = array[i];
        }
        sortArray(leftArray);
        sortArray(rightArray);
        //Слияние
        int x = 0, y = 0, z = 0;
        while (x < leftArray.length && y < rightArray.length) {
            if (leftArray[x] <= rightArray[y]) {
                array[z] = leftArray[x];
                x++;
            } else {
                array[z] = rightArray[y];
                y++;
            }
            z++;
        }
        for (; x < leftArray.length; x++, z++) {
            array[z] = leftArray[x];

        }
        for (; y < rightArray.length; y++, z++) {
            array[z] = rightArray[y];
        }
    }

}
