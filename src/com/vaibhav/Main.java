package com.vaibhav;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello world");
        System.out.println(isOdd(107));

    }

    private static int isOdd(int i) {
        return (i & 1) ;
    }
}
