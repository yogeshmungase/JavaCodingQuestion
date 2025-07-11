package org.example.string;

public class ReverseString {

    public static void main(String[] args) {

        String str = "Yogesh";
        String r_str = "" ;
        System.out.println(str.length());

        for(int i = str.length()-1; i>=0;i--){
            r_str = r_str + str.charAt(i);
        }
        System.out.println(r_str);
    }
}
