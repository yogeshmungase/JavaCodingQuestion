package org.example.arrays;

public class MinMax {
//    Find the maximum and minimum element in an array

    public static void main(String[] args) {

        int[] array = {12,23,34,45,56,67,89,98};
        int min = array[0];
        int max = array[0];

        for(int i =0; i< array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }

        for(int i =0; i< array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }

        System.out.println(" Max : "+ max);
        System.out.println(" Min : "+ min);
    }
}
