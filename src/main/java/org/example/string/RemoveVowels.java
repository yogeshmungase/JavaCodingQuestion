package org.example.string;

import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string or statement :");
        String sr = sc.nextLine();

        for(int i =0; i<sr.length();i++){
            char ch = sr.charAt(i);

            if(ch == 'a' || ch == 'e'||ch == 'i' || ch == 'o'||ch == 'u'){
                continue;
            }else {
                System.out.print(ch);
            }
        }
    }
}
