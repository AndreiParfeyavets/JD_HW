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

        MyList<String> newMyList = new MyList<>();
        newMyList.add("000");
        newMyList.add("3444");
        newMyList.add("5555");
        newMyList.add("5555");
        newMyList.add("5555");

        System.out.println("newMyList: " + newMyList);

        myList.addAll(newMyList);
        System.out.println("myList + newMyList: " + myList);
        myList.clear();
        System.out.println("myList: " + myList + " - clear");


    }
}
