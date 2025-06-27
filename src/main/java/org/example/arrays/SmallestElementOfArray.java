package org.example.arrays;

public class SmallestElementOfArray {
    //Java Program to print the smallest element in an array

    public static void main(String[] args) {

        int[] array = { 90,78,56,34,76,12,45,23,67};

        int min = array[0];
        for(int i = 0; i< array.length;i++){
            if(min > array[i]){
                min = array[i];
            }
        }
        System.out.println("smallest Element in array is : "+min);
    }

}
