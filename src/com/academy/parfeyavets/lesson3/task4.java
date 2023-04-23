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

// в общем те же ошибки про которые я рассказывал в субботу. перенеси весь код в Task4.
// выдели отдельные методы, которые принимают и возвращают требуемые аргументы
// и вызывай эти методы из метода main()
