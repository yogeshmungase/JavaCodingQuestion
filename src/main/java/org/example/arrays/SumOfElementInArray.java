package org.example.arrays;

public class SumOfElementInArray {

    //Java Program to print the sum of all the items of the array
    public static void main(String[] args) {

        int[] array = {12,23,34,45,67,89,90,78,56};
        int sum =0;

        for(int i =0; i< array.length; i++){
            sum +=  array[i];
        }
        System.out.println("Sum of Element in Array is :" + sum);
    }
}
