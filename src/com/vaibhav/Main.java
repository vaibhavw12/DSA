package com.vaibhav;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
//        System.out.println("hello world");
//        System.out.println(isOdd(107));
        int b =  123;
        int fact = 1;
        while(b>0){
            fact = b * fact;
            System.out.println(fact);
            b--;
        }
        System.out.println(fact);
    }

    private static int isOdd(int i) {
        return (i & 1) ;
    }
}
