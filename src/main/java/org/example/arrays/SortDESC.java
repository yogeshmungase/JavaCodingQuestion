package org.example.arrays;

public class SortDESC {
    //Java Program to sort the elements of an array in descending order

    public static void main(String[] args) {
        int[] array = {12, 23, 34, 45, 56, 67, 21, 32, 43, 54, 65, 76};
        int temp = 0;

        System.out.println("Original Array is :");
        for (int arr : array) {
            System.out.print(arr + " ");
        }

        for(int i =0; i< array.length; i++){
            for(int j =i+1; j<array.length; j++){
                if(array[i]<array[j]){
                  temp = array[i];
                  array[i] = array[j];
                  array[j] = temp;
                }
            }

        }
        System.out.println();

        //Displaying elements of array after sorting
        System.out.println("Elements of array sorted in descending order: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
