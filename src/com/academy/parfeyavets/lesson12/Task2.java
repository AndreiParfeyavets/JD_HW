package com.academy.parfeyavets.lesson12;

import java.security.Key;
import java.util.*;

public class Task2 {
    public static <K> void main(String[] args) {
        System.out.println("Введите данные:");
        Scanner scan = new Scanner(System.in);
        String s = "";
        ArrayList<K> keyList = new ArrayList<>();
        while (!s.equalsIgnoreCase("end")) {                         //Загоняем все в лист кроме "End"
            s = scan.nextLine();
            if (s.equalsIgnoreCase("end")) {
                break;
            }
            K keys = (K) s;
            keyList.add(keys);
        }
        keyList.trimToSize();
        System.out.println("List из консоли: " + keyList);
//

    }
}
