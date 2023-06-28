package com.academy.parfeyavets.lesson12;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        HashSet<Integer> setA = new HashSet<>(Arrays.asList(1,2,3,4,5));
        TreeSet<Integer> setB = new TreeSet<>(Arrays.asList(4,5,6,7,8));
        Set<Integer> cross = getCross(setA, setB);
        System.out.println(cross);
        Set<Integer> union = getUnion(setA, setB);
        System.out.println(union);


    }
    public static Set<Integer> getCross(Set setA, Set setB){
        HashSet<Integer> setZ = new HashSet<>();
        Iterator<Integer>  iterator = setA.iterator();
        while (iterator.hasNext()){
            Integer next = iterator.next();
            if(setB.contains(next)){
                setZ.add(next);
            }
        }
        return setZ;
    }
    public static Set<Integer> getUnion (Set setA, Set setB){
        HashSet<Integer> setZ = new HashSet<>();
        setZ.addAll(setA);
        setZ.addAll(setB);
        return setZ;
    }
}
