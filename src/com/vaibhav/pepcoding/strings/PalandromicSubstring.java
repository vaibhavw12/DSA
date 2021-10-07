package com.vaibhav.pepcoding.strings;

import java.util.Scanner;

public class PalandromicSubstring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        printPalandromicSubstring(str);
    }

    private static void printPalandromicSubstring(String str) {
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){                              //   abccbc palindromic substring  -> a b bccb c cc c cbc b c
                if(checkPalindrome(str.substring(i,j))){
                    System.out.println(str.substring(i,j));
                }
            }
        }
    }

    private static boolean checkPalindrome(String substring) {
        int start = 0;
        int end = substring.length()-1;
        while (start<end){
            if(substring.charAt(start)!=substring.charAt(end)){
                return false;
            }
            start++;end--;
        }
        return true;
    }
}
