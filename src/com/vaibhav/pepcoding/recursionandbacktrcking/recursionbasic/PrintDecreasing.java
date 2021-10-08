package com.vaibhav.pepcoding.recursionandbacktrcking.recursionbasic;

import java.util.Scanner;

public class PrintDecreasing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        printDecreasing(num);
    }
    // recursion logic
    // f(n) = print(n) + f(n-1)
    private static void printDecreasing(int num) {
        if(num==0){             // base case
            return;
        }
        System.out.println(num);             // line will execute for increasing stack space i.e before return statement get called
        printDecreasing(num-1);               // recursive call upto condition return
    }
}
