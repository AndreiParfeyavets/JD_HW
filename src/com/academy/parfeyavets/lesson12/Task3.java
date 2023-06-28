package com.academy.parfeyavets.lesson12;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Введите данные:");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println("Скобки расставлены правильно: - " + braketsMethod(str));

    }
    private static boolean braketsMethod(String str) {
        Map<Character, Character> brackets = new HashMap<>();
        brackets.put(')', '(');
        brackets.put('}', '{');
        brackets.put(']', '[');
        Deque<Character> deque = new LinkedList<>();
        for (Character s : str.toCharArray()) {
            if (brackets.containsValue(s)) {
                deque.push(s);
            } else if (brackets.containsKey(s)) {
                if (deque.isEmpty() || deque.pop() != brackets.get(s)) {
                    return false;
                }
            }
        }
        return deque.isEmpty();
    }
}