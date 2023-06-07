package com.academy.parfeyavets.lesson8;

public class Task1 {
    public static void main(String[] args) {
        String str = "abv lkdfsl fgdkm.mfsdf";
        if (str.startsWith("abc") == true){
         String str1 = str.replace("abc", "www");
            System.out.println(str1);
        } else{
            String str2 = str.concat("zzz");
            System.out.println(str2);
        }
    }
}
