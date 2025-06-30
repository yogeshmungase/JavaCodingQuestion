package org.example.arrays;

public class ThirdLargestNumber {

    //Find 3rd Largest Number in an Array

    public static void main(String[] args) {

        int[] arr = {44,66,99,77,33,22,55};
        int temp =0;

        System.out.println("Original Array :");

        for(int array : arr){
            System.out.print( array + " ");
        }


        for(int i =0; i< arr.length; i++){
            for(int j =i+1; j< arr.length; j++){
                if(arr[i]< arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println();

        System.out.println( "Third Largest array is "+arr[1]);
    }
}
