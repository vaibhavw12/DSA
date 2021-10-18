package com.vaibhav.pepcoding.recursionandbacktrcking.recursion_onthewayup;

import java.util.Scanner;

// display all subsequence of given string without using extra space
public class PrintSubSequence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        printSubSequence(str,"");
    }
    // total 2**str.length() subsequence will be printed
    private static void printSubSequence(String str, String result) {
        if(str.length()==0){
            System.out.println(result);
            return;
        }
        char ch = str.charAt(0);
        String remaining = str.substring(1);
        // as every char has two choices so 2 calls for respective choices for each char
        printSubSequence(remaining,result+"_");
        printSubSequence(remaining,result+ch);
    }
}
