package org.example.arrays;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfElement {
//    Java Program to find the frequency of each element in the array

    public static void main(String[] args) {

        int[] array1 = {12,23,34,45,56,67,12,34,45,67,23};
        System.out.println("length of the array "+array1.length);
//        int[] fr = new int[array1.length];
//        int visited = -1;
//
//        for(int i = 0; i< array1.length;i++){
//            int count = 1;
//            for(int j = i+1;j< array1.length;j++){
//                if(array1[i] == array1[j]){
//                    count++;
//
//                    fr[j] = visited;
//                }
//            }
//            if(fr[i]!=visited)
//                fr[i] = count;
//        }
//        System.out.println("=================================");
//        System.out.println("Element | Frequency ");
//        System.out.println("==================================");
//        for(int i=0;i<fr.length;i++){
//            if(fr[i]!= visited){
//                System.out.println("  "+array1[i]+" | "+fr[i]);
//            }
//
//        }
//
//        System.out.println("-------------------------------");

        Map<Integer, Integer> frequencyMap = new HashMap<>();
//
        for(int num : array1){
             frequencyMap.put(num, frequencyMap.getOrDefault(num, 0 )+1);
        }

        System.out.println("========================================");
        System.out.println("Element  |   Frequency");
        System.out.println("========================================");
        for(Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()){
            System.out.println("  "+ entry.getKey()+ "   |   "+ entry.getValue());
        }
        System.out.println("--------------------------------------------");
//
//
//
//
    }

}
