package com.academy.parfeyavets.lesson3;

public class Task7 {
    public static void main(String[] args) {
        int[][] matrix = {
                {3, 11, 5},
                {17, 7, 9},
                {8, 6, 7}
        };
        int i = getMaxSumLineIndex(matrix);
        System.out.print("Индекс строки = " + i);
    }

    public static int getMaxSumLineIndex(int[][] matrix) {
        int max = 0;
        int index = 0;
        for (int i = 0; i < matrix[0].length; i++) {
            int summ = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                summ = summ + matrix[i][j];
            }
            if (max < summ) {
                max = summ;
                index = i;
            }
        }
        return index;
    }
}
