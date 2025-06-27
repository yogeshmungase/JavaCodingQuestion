package org.example.arrays;

import java.util.Scanner;

public class RotateByKPosition {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        System.out.println("Enter the No of Position to rotate :");
        int k = sc.nextInt();
        int n= array.length;

        for(int i=0; i< array.length;i++){
            System.out.println("Enter the element :"+(i+1)+" :");
            array[i] = sc.nextInt();
        }

        for(int arr : array){
            System.out.print(arr+" ");
        }
//        k = k % n;

        reverse(array, 0,k-1);
        reverse(array, k,n-1);
        reverse(array, 0, n-1);

        System.out.println("\n Array after left rotation by " + k + " positions:");
        for(int num : array){
            System.out.print(num+ " ");
        }
    }

    public static void reverse(int[] arr, int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end]= temp;

            start++;
            end--;
        }
    }
}
