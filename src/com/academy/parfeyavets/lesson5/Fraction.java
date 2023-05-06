package com.academy.parfeyavets.lesson5;

public class Fraction {
    private int numinator;
    private int denominator;
    static int currNuminator = 1;
    static int currDenominator = 3;

    public Fraction(int numinator, int denominator) {
        if (denominator == 0){
            System.out.println("Знаменатель = 0");
        }
        this.numinator = numinator;
        this.denominator = denominator;
    }

    public static void stringXY (int numinator, int denominator){
        String strNum = Integer.toString(numinator);
        String strDen = Integer.toString(denominator);
        System.out.println(strNum +"/"+strDen);
    }

    public static Fraction Addition (Fraction fraction1) {
        Fraction summa  = new Fraction(currNuminator * fraction1.denominator + currDenominator * fraction1.numinator, currDenominator * fraction1.denominator);
//        System.out.println(summa.numinator + "/" + summa.denominator);
        return summa;
    }

    public static Fraction Multipl (int a) {
        Fraction multipl  = new Fraction(currNuminator * a , currDenominator);
//        System.out.println(multipl.numinator + "/" + multipl.denominator);
        return multipl;
    }

    public static Fraction Division (int a) {
        Fraction division  = new Fraction(currNuminator  , currDenominator* a);
//        System.out.println(division.numinator + "/" + division.denominator);
        return division;
    }
    public static void AdditionFraction (Fraction fraction1, Fraction fraction2) {
        Fraction summaFraction  = new Fraction (fraction1.numinator*fraction2.denominator+fraction2.numinator*fraction1.denominator, fraction1.denominator*fraction2.denominator);
        System.out.println("Сумма двух дробей равна = " + summaFraction.numinator + "/" + summaFraction.denominator);
    }

    public static void MulDivFraction (Fraction fraction1, int a) {
        Fraction multiplFraction = new Fraction (fraction1.numinator*a, fraction1.denominator);
        Fraction divisionFraction = new Fraction (fraction1.numinator, fraction1.denominator*a);
        System.out.println("Умножение дроби на число равно = " + multiplFraction.numinator + "/" + multiplFraction.denominator);
        System.out.println("Деление дроби на число равно = " + divisionFraction.numinator + "/" + divisionFraction.denominator);
        return;

    }

    public int getNuminator() {
        return this.numinator;
    }

    public void setNuminator() {
        this.numinator = numinator;
    }
    public int getDenominator() {
        return this.denominator;
    }

    public void setDenominator() {
        this.denominator = denominator;
    }
}
