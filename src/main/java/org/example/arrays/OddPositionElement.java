package org.example.arrays;

public class OddPositionElement {
    // Java Program to print the elements of an array present on odd position

    public static void main(String[] args) {

        int[] array = {12,23,34,45,56,67,78,89,90};

        for(int i = 1; i< array.length;i++){
            if(i % 2 != 0){
                System.out.println("Index : "+ i + " : "+array[i]);
            }
        }
    }
}
