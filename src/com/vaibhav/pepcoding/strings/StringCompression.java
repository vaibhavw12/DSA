package com.vaibhav.pepcoding.strings;

import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);                                 // str = aaabbcccddaeef   compression1 -> abcdaef
        String str = in.next();                                              //                        compression2 -> a3b2c3d2ae2f
        printCompressionString1(str);
        printCompressionString2(str);
    }

    private static void printCompressionString2(String str) {
        String s = "" + str.charAt(0);
        int j = 1,count = 1;
        for(int i=1;i<str.length();i++){
            if(s.charAt(j-1)==str.charAt(i)){
                count++;
            }else{
                if(count>1){
                    s+=count;j++;
                }
                s+=str.charAt(i);
                j++;count = 1;
            }
        }
        System.out.println(s);
    }

    private static void printCompressionString1(String str) {
        String s = ""+ str.charAt(0);
        int j = 1;
        for(int i=1;i<str.length();i++){
            if(s.charAt(j-1)!=str.charAt(i)){
                s+=str.charAt(i);
                j++;
            }
        }
        System.out.println(s);
    }
}
