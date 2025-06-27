package org.example.arrays;

import java.util.Arrays;
import java.util.Collections;

public class ReverseElementOfArray {
//    Java Program to print the elements of an array in reverse order
public static void main(String[] args) {
    Integer[] org_array = {1,2,3,4,5,6,7};
    System.out.print("Original array : ");
    for(int array: org_array){
        System.out.print(array + " ");

    }


//    int start = 0;
//    int end = org_array.length-1;
//    while (start < end){
//        int temp = org_array[start];
//        org_array[start] = org_array[end];
//        org_array[end]= temp;
//
//        start++;
//        end--;
//    }
    System.out.print("\nReverse array : ");
    Collections.reverse(Arrays.asList(org_array));
    for(int array: org_array){
        System.out.print(array + " ");
    }
}
}
