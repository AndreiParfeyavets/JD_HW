package com.academy.parfeyavets.lesson5;

public class Task2 {
    public static void main(String[] args) {
        Fraction fraction1 = new Fraction(3,5);

        Fraction.stringXY(fraction1.getNuminator(), fraction1.getDenominator());
        Fraction.Addition(fraction1);
        Fraction.Multipl(5);
        Fraction.Division(5);

        Fraction fraction2 = new Fraction(5,9);

        Fraction.AdditionFraction(fraction1, fraction2);
        int a = 10;
        Fraction.MulDivFraction(fraction1,a);
    }
}
