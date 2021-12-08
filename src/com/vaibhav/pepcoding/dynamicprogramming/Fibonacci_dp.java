package com.vaibhav.pepcoding.dynamicprogramming;

import java.util.Scanner;

public class Fibonacci_dp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter num to find its fibonacci :");
        int num = in.nextInt();
        int fib1 = fib_not_using_dp(num);
        System.out.println(fib1);
        int[] dp_arr = new int[num+1];
        int fib2 = fib_using_dp(num,dp_arr);
        System.out.println(fib2);

    }

    private static int fib_using_dp(int num, int[] dp_arr) {

        if(num==0 || num==1){
            return num;                                       // an arr dp_arr[] is used here
        }                                                     // using dp ->> an extra array to store already use variable so that it can't get invoke again
        if(dp_arr[num]!=0){
            return dp_arr[num];
        }

        int fib1 = fib_using_dp(num-1,dp_arr);
        int fib2 = fib_using_dp(num-2,dp_arr);
        int result = fib1 + fib2;
        dp_arr[num] = result;
        return result;
    }
    // using faith and exception method of recursion
    private static int fib_not_using_dp(int num) {                // recursive logic for calculating fib

        if(num==0 || num==1){
            return num;
        }

        int fib1 = fib_not_using_dp(num-1);     // fun will give (n-1) fib
        int fib2 = fib_not_using_dp(num-2);      // fun will give (n-2) fib
        return fib1 + fib2;
    }

}
