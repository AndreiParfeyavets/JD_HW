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
        System.out.println("List + myList"+list);

        myList.addAll(newList);//в своем методе я окончательно заптулся. пробовал много разного.


        myList.clear();
        System.out.println(myList);


    }
}
