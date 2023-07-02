package com.academy.parfeyavets.lesson11;

import java.util.*;

public class MyList<T> implements List<T> {

    private T[] elements = (T[]) new Object[]{};
    private int size;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        String separator = "";
        for (int i = 0; i < size; i++) {
            sb.append(separator).append(elements[i]);
            separator = ", ";
        }
        sb.append("]");
        return sb.toString();
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        Object[] toReturn = new Object[size];
        for (int i = 0; i < size; i++) {
            toReturn[i] = elements[i];
        }
        return toReturn;
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }


    @Override
    public boolean add(T t) {
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, elements.length * 3 / 2 + 1);
        }
        elements[size] = t;
        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        if (c.size() == 0){
            return false;
        }
        T[] addElements = (T[]) c.toArray();
        int capacity = elements.length;
        int newCapacity = size+addElements.length;
        if (capacity < newCapacity) {
            elements = Arrays.copyOf(elements, size+addElements.length);
        }
        for (int i = 0; i < addElements.length; i++) {
            elements[i+size]=addElements[i];
        }
//        if (addElements.length > size-elements.length){
//            elements = Arrays.copyOf(elements, elements.length+addElements.length);
//        }
//        System.arraycopy(addElements, 0, elements,capacity, addElements.length);
        size = size+addElements.length;
        return true;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
            size--;
        }
    }

    @Override
    public T get(int index) {
        if (index > (size - 1)) {
            throw new IndexOutOfBoundsException();
        }
        return elements[index];
    }

    @Override
    public T set(int index, T element) {
        if (index > size - 1) {
            throw new IndexOutOfBoundsException();
        }
        elements[index] = element;
        return null;
    }

    @Override
    public void add(int index, T element) {// 1, 2, 3, 4
        if (size == elements.length) {      // 1, 2, 9, 3, 4
            elements = Arrays.copyOf(elements, elements.length * 3 / 2 + 1);
        }
        System.arraycopy(elements, index, elements, index + 1, size - index);
        elements[index] = element;
        size++;
    }

    @Override
    public T remove(int index) {
        T element = elements[index];
        System.arraycopy(elements, index + 1, elements, index, size - index - 1);
        size--;
        return element;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }
}
