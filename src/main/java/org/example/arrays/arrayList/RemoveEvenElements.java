package org.example.arrays.arrayList;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class RemoveEvenElements {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(11);
        list.add(13);
        list.add(16);
        list.add(17);
        list.add(18);
        list.add(21);
        list.add(9);
        System.out.println("Before removing even element "+ list);

        RemoveEven((ArrayList<Integer>) list);
        System.out.println("After removing even element "+list);
    }

    public static  void RemoveEven(ArrayList<Integer>list){


        for(int i = list.size()-1; i>=0;i--){
            if(list.get(i) % 2 == 0){
                list.remove(i);
            }
        }
    }
}
