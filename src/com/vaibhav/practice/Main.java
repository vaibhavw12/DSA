package com.vaibhav.practice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Integer a=10,b=25,c=15;
        Integer res = 0;
        while (b>0){
            res += (a % c) + (c % a);
            b-= a%c;
            swap(a,c);
        }
        System.out.println(res);
    }

    private static void swap(Integer a, Integer c) {
        Integer b = c;
        c = a;
        a = b;
    }
}
