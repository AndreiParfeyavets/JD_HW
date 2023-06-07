package com.academy.parfeyavets.lesson9;

public class GenConstr {
    private String s;

    <T extends Number> GenConstr(T ob1) {
        s = ob1.toString();
    }

    <T extends Number> boolean compare (T ob2){

        if (s.length() == ob2.toString().length()){
            return true;
        } else {
            return false;
        }
    }


}
