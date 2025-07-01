package org.example.arrays;

import java.util.Scanner;

public class SubArray {
    // print the sub array of the array

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[4];
        System.out.println("Enter the element of array :");

        for(int i = 0 ; i< array.length; i++){
            array[i] = sc.nextInt();
        }
        System.out.println(" Original array is :");
        for(int arr:array){
            System.out.print( "{ "+arr + " }");
        }


        System.out.println("\n SubArray is :");

        // logic for subarray
        for(int a = 0; a< array.length; a++){
            for(int b = a; b< array.length; b++){
                for(int k = a; k<=b; k++){

                   System.out.print( "{ "+ array[k] + " }");
                }
                System.out.println();
            }

        }
    }
}
