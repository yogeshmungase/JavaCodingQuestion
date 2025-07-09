package org.example.basic;

public class ForEachDemo {
    public static void main(String[] args) {

        Object [] array = {12, "java", 35.35, 'A', false};

        for(Object arr : array ){
            System.out.print(arr+" ,");
        }
    }
}
