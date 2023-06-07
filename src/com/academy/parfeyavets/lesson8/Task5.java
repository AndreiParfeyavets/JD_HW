package com.academy.parfeyavets.lesson8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5 {
    public static void main(String[] args) {
        String s = "5454+123456789+1234567891011100647+12345678910111+1234567890+12345678910d6";
        printPhoneNumber(s);
    }

    public static void printPhoneNumber(String s) {
        Pattern pattern = Pattern.compile("\\+[0-9]{9,14}\\b");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
