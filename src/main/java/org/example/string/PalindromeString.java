package org.example.string;

public class PalindromeString {

    public static void main(String[] args) {

        String str = "madam";

        String rstr = "";

        for(int i = str.length()-1 ; i>=0;i--){
            rstr += str.charAt(i);
        }
        if(str.equals(rstr) ){
            System.out.println(true);
        }else
            System.out.println(false);

    }
}
