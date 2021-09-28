package com.vaibhav;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello world");
        System.out.println(isOdd(107));

    }

    private static int isOdd(int i) {
        return (i & 1) ;
    }
}
