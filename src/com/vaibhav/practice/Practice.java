package com.vaibhav.practice;

import java.util.Scanner;

// problem 2  ->> ISH AND STRING GAME

public class Practice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = 0;
        test = in.nextInt();
        while (test > 0){
            String a = new String();
            String b = new String();
            a = in.next();
            b= in.next();
            StringBuilder sb = new StringBuilder(a);
            for(int i=0;i<b.length();i++){
                for(int j=0;j<a.length();j++){
                    if(b.charAt(i)==a.charAt(j)){
                        int ind = sb.indexOf(b.charAt(i)+"");
                        sb.deleteCharAt(ind);
                    }
                }
            }
            System.out.println(sb);
            test--;
        }

    }
}
