package com.vaibhav.pepcoding.recursionandbacktrcking.recursion_onthewayup;

import java.util.Scanner;

public class PrintPermutations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        printPermutations(str,"");
    }

    private static void printPermutations(String str, String result) {
        if(str.length()==0){
            System.out.println(result);
            return;
        }
        // loop will run for every char in String str and always the value of srt is also changing
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            StringBuilder remaining = new StringBuilder(str);
            remaining.deleteCharAt(i);
            printPermutations(remaining+"",result+ch);
        }
    }
}
