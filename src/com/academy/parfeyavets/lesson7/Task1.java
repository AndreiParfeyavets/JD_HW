package com.academy.parfeyavets.lesson7;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Document doc1 = new Document("Magazine", 25);
        Document doc2 = new Document("Diary", 15);
        Document doc3 = new Document("Instruction", 20);

//        System.out.println(doc1.hashCode());

        Document[] documents = new Document[3];
        documents[0] = doc1;
        documents[1] = doc3;
        documents[2] = doc2;
        Arrays.sort(documents);
        System.out.println(Arrays.toString(documents));

        Document doc4 = (Document) doc1.clone();

        System.out.println(doc1 == doc4);
        System.out.println(doc1.equals(doc4));
        System.out.println(doc4.equals(doc2));

        Object doc5 = doc4;
        Printable printDoc4 = (Printable) doc5;
        printDoc4.print();

    }
}
