package com.vaibhav.pepcoding.strings;

import java.util.Scanner;

public class PermutationsofString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        printPermutations(str);
    }

    private static void printPermutations(String str) {
        // for n char in string having n! permutations so,
        int fact = 1;
        for(int i=2;i<=str.length();i++){
            fact=fact*i;
        }
        // total fact permutations of given string
        // iterative algorithm to find permutations of string using factorial
        for(int i=0;i<fact;i++){
            StringBuilder sb = new StringBuilder(str);
            int temp = i;
            for(int j=str.length();j>0;j--){  // for each i=temp in for each char in str print(temp%j) to get it in betwn 0 to str.length-1
                int d = temp % j;             // and display each char remove char and repeat for each j betwn str.length to 1
                temp = temp / j;
                System.out.print(sb.charAt(d));
                sb.deleteCharAt(d);
            }
            System.out.println();
        }
    }
}
