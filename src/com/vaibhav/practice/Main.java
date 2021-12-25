package com.vaibhav.practice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String given = new String();
        given = in.next();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<given.length();i++){
            for(int j=0;j<=i;j++){
                sb.append(given.charAt(i));
            }
        }
        System.out.println(sb);
    }
}
