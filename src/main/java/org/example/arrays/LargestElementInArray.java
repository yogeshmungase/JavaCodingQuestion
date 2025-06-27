package org.example.arrays;

public class LargestElementInArray {
    //Java Program to print the largest element in an array

    public static void main(String[] args) {

        int[] array = { 90,56,34,102,36,45,23,67};
        int largest = array[0];

        for(int i = 0 ; i< array.length;i++){
            if(largest < array[i] ){
                largest = array[i];
            }
        }
        System.out.println("Largest Element in array is :"+largest);
    }

}
