package com.academy.parfeyavets.lesson3;

public class task7 {
    public static void main(String[] args) {
        int[][] matrix = {
                {17, 7, 9},
                {3, 11, 5},
                {8, 6, 7}
        };
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
        System.out.print("Индекс строки = " + index);
    }
}
