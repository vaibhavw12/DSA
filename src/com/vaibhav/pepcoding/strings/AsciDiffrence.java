package com.vaibhav.pepcoding.strings;

import java.util.Scanner;

public class AsciDiffrence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        printAsciDiffrence(str);
    }

    private static void printAsciDiffrence(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));
        for(int i=1;i<str.length();i++){
            int d = str.charAt(i)-str.charAt(i-1);                   // abdgca     asci diffrence ->  a1b2d3g-4c-2a
             sb.append(d);
            sb.append(str.charAt(i));
        }
        System.out.println(sb);
    }
}
