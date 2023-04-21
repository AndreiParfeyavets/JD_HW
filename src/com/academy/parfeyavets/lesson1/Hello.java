package com.academy.parfeyavets.lesson1;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String helloWithName = printHelloWithName(line);
        System.out.println(helloWithName);
    }

    public static String printHelloWithName(String parameter) {
        return "Hello " + parameter + "!";
    }
}
