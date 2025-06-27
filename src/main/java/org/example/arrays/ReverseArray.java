package org.example.arrays;

import java.util.Arrays;
import java.util.Collections;

public class ReverseArray {
//    Java Program to left rotate the elements of an array
public static void main(String[] args) {

    int[] org_array = {12, 23, 34, 45, 56, 67, 78, 89};

    for (int array : org_array) {
        System.out.print(" \n Orignal array  :" + array);
    }

//    Collections.reverse(Arrays.asList(org_array));

    int start = 0;
    int end = org_array.length - 1;
    while (start < end) {
        int temp = org_array[start];
        org_array[start] = org_array[end];
        org_array[end] = temp;

        start++;
        end--;
    }
    System.out.println("\nReversed array:");
    for (int n : org_array) {
        System.out.print(n + " ");
    }
}}

