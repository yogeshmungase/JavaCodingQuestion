package org.example.arrays;

public class CopyElement {
//    Java Program to copy all elements of one array into another array

    public static void main(String[] args) {

        int[] arr = {12,23,34,45,56,78,89,90};
        int[] copy = new int[arr.length];

        for(int array : arr){
            System.out.print(array + " ");
        }
        for(int i=0; i < arr.length ; i++){
           copy[i] = arr[i];
        }
        System.out.println();
        System.out.println("Copy array is : ");
        for(int copyArray: copy){
            System.out.print(copyArray + " ");
        }
    }
}
