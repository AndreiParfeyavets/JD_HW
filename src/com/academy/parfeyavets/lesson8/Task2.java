package com.academy.parfeyavets.lesson8;

public class Task2 {
    public static void main(String[] args) {
        String str = " lfkjd         ljkfnl  klmk    ;dlfs ";
        while (str.contains("  ")){
            String str1 = str.replace( "  ", " ");
            str=str1;
        }
        System.out.println(str.trim());
    }
}
