package com.academy.parfeyavets.lesson8;

import java.util.regex.Pattern;

public class Task4 {
    public static void main(String[] args) {
        String s = "Listen to the news from today and read the text at the same time. Listen to the news from today without reading the text."; //это предложение из примера. должно быть 14, у тебя показывает 7.
        int count = 0;
        boolean b = false;

        Pattern pattern = Pattern.compile("[^A-z]+");
        String[] split = pattern.split(s, 0);



        for (int i = 0; i < split.length; i++) {
            for (int j = 0; j < split.length; j++) {
                if (i == j){
                    continue;
                }
                b = split[i].equalsIgnoreCase(split[j]);
                if (b){
                    break;
                }
            }
            if (!b) {count++; System.out.println(split[i]);}
//            b=false;
        }

        System.out.println("Уникальных слов: "+count);
    }
}