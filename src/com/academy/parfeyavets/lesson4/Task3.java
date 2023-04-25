package com.academy.parfeyavets.lesson4;


import java.util.Scanner;

public class Task3 {
    public static void main(String[] args){
        System.out.println("Введите количество чисел Фибоначчи, которое хотите увидеть на экране");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Method 1: ");
        fibonachi(n);
        for (int i = 0; i < n; i++) { // пишем не <= а < т.к. мы считаем с 1, а Java с 0
            System.out.print(fibonachi(i) + " ");
        }
        System.out.println("\n" + "Method 2: ");
        fibonachi2(0, 1, n);
        for (int i = 0; i < n; i++) { // пишем не <= а < т.к. мы считаем с 1, а Java с 0
            System.out.print(fibonachi(i) + " ");
        }
    }

    private static int fibonachi(int n) {
        if (n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        else {
            return fibonachi(n-1) + fibonachi(n-2);
        }

    }
    private static int fibonachi2(int a, int b, int n) {
        if (n <=0){
            return b;
        }
        else {
            return fibonachi2(b,a+b,n-1);
        }
    }
}
