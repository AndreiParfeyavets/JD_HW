package com.academy.parfeyavets.lesson11;

import java.util.ArrayList;

public class Task {
    public static void main(String[] args) {
        MyList<String> myList = new MyList<>();
        myList.add("qwer");
        myList.add("asdf");
        myList.add("123");
        myList.add("456");
        System.out.println(myList);

        myList.add(1, "222");
        System.out.println(myList);

        myList.set(0, "404err");
        System.out.println(myList);

        myList.remove(2);
        System.out.println(myList);

        System.out.println(myList.get(1));
        System.out.println(myList);

        ArrayList<String> list = new ArrayList<>(10);
        list.add("ddd");
        ArrayList<String> newList = new ArrayList<>(10);
        newList.add("2dfs");
        list.addAll(newList);
        System.out.println(list);
        list.addAll(myList);//Почему не добавляет myList???????? Это же стандартный метод ArrayList, а не мой.
        //потому что стандартный метод на ТВОЕЙ коллекции вызывает  Object[] a = c.toArray();
        //а он у тебя не переопределен
        System.out.println("List + myList"+list);

        myList.addAll(newList);//в своем методе я окончательно заптулся. пробовал много разного.
/*
 @Override
    public boolean addAll(Collection<? extends T> c) {
        T[] array = (T[]) c.toArray();
        int positionIndex = elements.length;
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, elements.length + c.size());
        }
        size += c.size();
        System.arraycopy(array, 0, elements, positionIndex , array.length);
        return true;
        }

        как один из вариантов. разберись только как работает
 */

        myList.clear();
        System.out.println(myList);


    }
}
