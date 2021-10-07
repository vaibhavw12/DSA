package com.vaibhav.pepcoding.strings;

import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        toggle(str);
    }
    // logic
    //  'V'-'A' = 'v'-'a' i.e ,Ascii of uppercase - 'A' = lowercase - 'a'
    private static void toggle(String str) {
        StringBuilder sb = new StringBuilder(str);
        for(int i=0;i<sb.length();i++){                                                   // VaiBhAv toggle-> vAIbHaV
            // means lowercase then toggle it to uppercase
            if(sb.charAt(i)>='a' && sb.charAt(i)<='z'){
                sb.setCharAt(i,(char)(sb.charAt(i)+'A'-'a'));
            }
            // means uppercase then toggle it to lowercase
            else{
                sb.setCharAt(i,(char)(sb.charAt(i)-'A'+'a'));
            }
        }
        System.out.println(sb);
    }
}
