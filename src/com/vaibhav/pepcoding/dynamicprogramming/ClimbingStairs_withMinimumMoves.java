package com.vaibhav.pepcoding.dynamicprogramming;

import java.util.ArrayList;
import java.util.Scanner;

/*
1. You are given a number n, representing the number of stairs in a staircase.
2. You are on the 0th step and are required to climb to the top.
3. You are given n numbers, where ith element's value represents - till how far from the step you
     could jump to in a single move.  You can of-course fewer number of steps in the move.
4. You are required to print the number of minimum moves in which you can reach the top of
     staircase.
Note -> If there is no path through the staircase print null.
 */
public class ClimbingStairs_withMinimumMoves {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int stairs = in.nextInt();
        int[] stairs_jumps = new int[stairs];
        for(int i=0;i<stairs;i++){
            stairs_jumps[i] = in.nextInt();
        }

    //    int[] dp = new int[stairs+1];                                   // storage
        Integer[] dp = new Integer[stairs+1]; // as empty Integer array contains null and empty array contain 0
        dp[stairs] = 0;    //i.e at top it need zero moves     // meaning
        // direction
        for(int i=stairs-1;i>=0;i--){
            if(stairs_jumps[i]>0){
                int min = Integer.MAX_VALUE;
                for(int j=1;j<=stairs_jumps[i] && i+j<dp.length;j++){
                    if(dp[i+j]!=null){
                        min = Math.min(min,dp[i+j]);
                    }
                }
                if(min!=Integer.MAX_VALUE){
                    dp[i] = min + 1;
                }else{
                //    dp[i] = null;    as already there
                }
            }
        }
        System.out.println(dp[0]);              // display minimum number of moves from 0 to top
    }
}
