package com.vaibhav.pepcoding.recursionandbacktrcking.recursionbasic;

import java.util.Scanner;

public class PrintDecreasingIncreasing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num =in.nextInt();
        printDecInc(num);
    }
    // recursion logic
    // so , f(n) = print(n) + f(n-1) + print(n)
    private static void printDecInc(int num) {
        if(num==0){                  // base case
            return;                  // when num==0 stack filled upto maximun space as all recursive call get executed ,
        }                            // and return to line 21 for each decreasing stack space

        System.out.println(num);     // gets executed before return gets call or for increasing stack space
        printDecInc(num-1);    // recursive call
        System.out.println(num);     // gets executed after return gets call or for decreasing stack space
    }
}
