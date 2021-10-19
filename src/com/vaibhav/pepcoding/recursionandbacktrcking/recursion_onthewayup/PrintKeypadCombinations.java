package com.vaibhav.pepcoding.recursionandbacktrcking.recursion_onthewayup;

import java.util.Scanner;

// display all combinations of given string without using extra space
public class PrintKeypadCombinations {
    static String[] given = {".," ,"abc" ,"def" ,"ghi" ,"jkl" ,"mno" ,"pqrs" ,"tu" ,"vwx" ,"yz"};
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the numbers for all different combinations :");
        String str = in.next();
        printKeyPadCombinations(str,"");
    }
    // recursion call inside loops can be easily visualized by Euler Tree
    private static void printKeyPadCombinations(String str, String result) {
        if(str.length()==0){
            System.out.println(result);
            return;
        }
        char ch = str.charAt(0);
        String remaining = str.substring(1);
        String atIndex = given[ch - '0'];
        for(int i=0;i<atIndex.length();i++){
            char ch_inIndex = atIndex.charAt(i);
            printKeyPadCombinations(remaining,result + ch_inIndex);         // outer loop ->> number of char present in string + forward recursive cals +
            // their loops + forward recursive call + their loops ++++ until remaining is null
        }
    }
}
