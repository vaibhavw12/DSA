package com.vaibhav.pepcoding.dynamicprogramming;

import java.util.Scanner;

/*
1. You are given a number n, representing the number of stairs in a staircase.
2. You are on the 0th step and are required to climb to the top.
3. You are given n numbers, where ith element's value represents - till how far from the step you
     could jump to in a single move.
     You can of course jump fewer number of steps in the move.
4. You are required to print the number of different paths via which you can climb to the top.
 */
public class ClimbingStairs_withJumps {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int stairs = in.nextInt();
        int[] stairs_jumps = new int[stairs];
        for(int i=0;i<stairs;i++){
            stairs_jumps[i] = in.nextInt();             // how many jumps can one take from that stair
        }

        int[] dp = new int[stairs+1];                                   // storage
        dp[stairs] = 1;                                                  // meaning
        for(int i=stairs-1;i>=0;i--){                                     // direction
            for(int j=1;j<=stairs_jumps[i] && i+j < dp.length;j++){        // travel and solve
                dp[i] += dp[i+j];
            }
        }
        System.out.println(dp[0]);
    }
}
