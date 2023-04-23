package com.academy.parfeyavets.lesson3;

import java.util.Scanner;

public class task5 { // не выполнено совсем. не работает само и не дает скомпилироваться всему проекту) пересмотри
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stringScan = scanner.nextLine();
        String trim = stringScan.trim();
        String[] split = stringScan.split(" ");

        minimal(split);

    }

    public static int minimal(String... array) {
        int min = array[0];                             // изначально min присваиваем нулевой элемент из массива
        for (int i = 1; i < array.length; i++) {        // перебираем массив с 1-ой ячейки, т.к. с 0-ой нет смысла
            if (array[i] < min) {                       // и сравниваем что меньше
                min = array[i];                         // и присваиваем меньшее в min, если условие выполняется. Так перебираются все элементы и находтися минимальное значение.
            }
        }
        return min;
        System.out.println(min);
    }

//    public static int maximal(int array) {
//        int maxx = array[0];
//        for (int i = 1; i < array.length; i++) {
//            if (array[i] > maxx) {
//                maxx = array[i];
//            }
//        }
//        return maxx;
//    }
}
