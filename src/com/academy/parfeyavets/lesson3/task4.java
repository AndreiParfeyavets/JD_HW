package com.academy.parfeyavets.lesson3;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stringScan = scanner.nextLine();
        String trim = stringScan.trim();
        String[] split = stringScan.split(" ");
        int[] array = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            array[i] = Integer.valueOf(split[i]);
        }
        for (int nubmer: array) {
            System.out.print(nubmer);
        }
    }
}
