package com.academy.parfeyavets.lesson10;

public class Task1 {
    public static void main(String[] args) {
        String s = null;
        try {
            if (Math.random() > 0.5) {
                s.length();
            } else {
                Integer.parseInt(s);
            }
        } catch (NumberFormatException e) {
            System.out.println("Exeption: " + e.getClass());
        } catch (NullPointerException e) {
            System.out.println("Exeption: " + e.getClass());
        }
    }
}
