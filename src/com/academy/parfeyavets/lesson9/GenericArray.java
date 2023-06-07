package com.academy.parfeyavets.lesson9;

import java.util.Arrays;

public class GenericArray<T extends Number> {
    private T[] array;

    public GenericArray(T[] array) {
        this.array = array;
    }

    public void printElement(int i) {
        if (i> array.length){
            System.out.println("В массиве нет элемента с таким индексом (i)! Задайте интдекс меньше длины массива.");
        }
        System.out.println(array[i]);
    }

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }
}
