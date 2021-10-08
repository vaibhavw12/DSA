package com.vaibhav.pepcoding.recursionandbacktrcking.recursionbasic;

import java.util.Scanner;

public class PrintIncreasing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        printIncreasing(num);
    }
    // recursion logic
    // f(n) = f(n-1) + print(n)
    private static void printIncreasing(int num) {
        if(num==0){            // base case
            return;
        }
        printIncreasing(num-1);        // recursive call
        System.out.println(num);             // line will execute for decreasing stack space i.e after return statement get called
    }
}
