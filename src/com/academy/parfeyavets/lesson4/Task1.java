package com.academy.parfeyavets.lesson4;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        double z = formula1(756.13, 0.3);
        System.out.println("z = " + z);
        double z2 = formula2(756.13, 0.3);
        System.out.println("z2 = " + z2);
        System.out.println("Задание 2");
        double y = formulaY(1.21, 0.371);
        System.out.println("y = " + y);
        System.out.println("Задание 3");
        formulaF();

    }

    private static double formula1(double a, double x) {
        double z1 = 0, z2 = 0, z3 = 0;
        z1 = Math.cos(Math.pow((x * x + Math.PI / 6), 5));
        z2 = Math.sqrt(x * Math.pow(a, 3));
        z3 = Math.log(Math.abs((a - 1.12 * x) / 4));
        double z = z1 - z2 - z3;
        return z;
    }

    private static double formula2(double a, double x) {
        double z = Math.cos(Math.pow((x * x + Math.PI / 6), 5)) - Math.sqrt(x * Math.pow(a, 3)) - Math.log(Math.abs((a - 1.12 * x) / 4));
        return z;
    }

    private static double formulaY(double a, double b) {
        double y = Math.tan(Math.pow((a + b), 2)) - Math.cbrt(a + 1.5) + Math.pow(b, 5) * a - b / Math.log(a * a);
        return y;
    }

    private static void formulaF() {
        double f = 0, x = 12.1, a = -5;
        do {

            f = Math.exp(x * a) - 3.45 * a;
            System.out.printf("a= %1$-5.2f x=%2$-5.1f f= %3$-1.5f%n",a,x,f);
            a= a+3.75;
        } while (a<=12);
    }
}

