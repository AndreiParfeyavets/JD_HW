package com.academy.parfeyavets.lesson10;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = "";
        double summ = 0;
        while (!s.equals("END")) {
            try {
                System.out.println("Введите данные:");
                s = scan.nextLine();
                if (s.equals("END")) {
                    break;
                }
                double v = Double.parseDouble(s);//Тут NumberFormatEx
                summ = summ + v;
                System.out.print("Число: " + v + ". ");
                if (summ < 0) {
                    throw new ArithmeticException();
                }
                System.out.println("Корень суммы" + " (" + summ + ") " + "всех чисел: " + Math.sqrt(summ));// Тут сумма не должна быть <0
            } catch (NumberFormatException e) {
                System.out.println("Неверныей ввод данных, введите цифры.");
            } catch (ArithmeticException e) {
                System.out.println("Сумма чисел:" + summ + " <0! Корень не извлекается");
            }
        }
    }
}


