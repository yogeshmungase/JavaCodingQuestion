package org.example.arrays;

public class RemoveDuplicateElement {
    //Remove Duplicate Element in an Array

    public static void main(String[] args) {

        int[] array = {12,23,34,45,56,12,34,45,};
        int[] arr1 = new int[array.length];
        System.out.println(" Original Array is : ");
        for(int arr : array){
            System.out.print(arr + " ");
        }


        for(int i =0; i< array.length; i++){
            for(int j =i+1; j< array.length; j++) {
                if (array[i] != array[j]){


                }
            }
        }
        System.out.println();

        System.out.println("After removing duplicate element :");
        for(int ar: arr1){
            System.out.print(ar+ " ");
        }
    }
}
