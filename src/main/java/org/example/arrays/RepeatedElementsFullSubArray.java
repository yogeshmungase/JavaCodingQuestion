package org.example.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RepeatedElementsFullSubArray {
    // Example: [ 1 1 2 2 3 3 3 3] can be divided into [1 1] [2 2] [3 3] [3 3]

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 4, 3, 1, 5, 4, 2, 2};

        Map<Integer, Integer> freqMap = new HashMap<>();

        for(int num : arr){
            freqMap.put(num, freqMap.getOrDefault(num, 0)+1);
        }

        for(Map.Entry<Integer,Integer> entry : freqMap.entrySet()){
            int value = entry.getKey();
            int count = entry.getValue();
            if(count >=2){
                List<Integer> subArray = new ArrayList<>();
                for(int i =0; i<count; i++){
                    subArray.add(value);
                }
                System.out.println(subArray);
            }
        }
    }
}
