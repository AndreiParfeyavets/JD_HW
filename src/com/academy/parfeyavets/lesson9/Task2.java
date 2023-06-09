package com.academy.parfeyavets.lesson9;

public class Task2 {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("Hello", 777);

        System.out.println("Первый элемент: " + pair.first());
        System.out.println("Последпний элемент: " + pair.last());

        Pair swapPair = pair.swap(); //тоже сырой тип. Укажи параметризацию
        System.out.println("Перемена мест: " + swapPair.first() + ", " + swapPair.last());

        pair.replaceFirst("World");
        System.out.println("Новый первый эелемент (того же типа): " + pair.first());

        pair.replaceLast(999);
        System.out.println("Новый последпний элемнт (того же типа): " + pair.last());







    }
}
