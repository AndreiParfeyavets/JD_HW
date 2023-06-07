package com.academy.parfeyavets.lesson9;

public class Pair<T, U> {
    private T obj1;
    private U obj2;

    public Pair(T obj1, U obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public T first() {
        return obj1;
    }

    public U last() {
        return obj2;
    }

    public Pair <U,T> swap(){
        return new Pair<>(this.obj2,this.obj1);
    }

    public void replaceFirst(T newObj1) {
        this.obj1 = newObj1;
    }

    public void replaceLast(U newObj2) {
        this.obj2 = newObj2;
    }


    public T getObj1() {
        return obj1;
    }

    public void setObj1(T obj1) {
        this.obj1 = obj1;
    }

    public U getObj2() {
        return obj2;
    }

    public void setObj2(U obj2) {
        this.obj2 = obj2;
    }
}
