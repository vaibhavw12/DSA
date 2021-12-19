package com.vaibhav.pepcoding.dynamicprogramming;

import java.util.Scanner;

/*
1. You are given a number n, representing the number of stairs in a staircase.
2. You are on the 0th step and are required to climb to the top.
3. In one move, you are allowed to climb 1, 2 or 3 stairs.
4. You are required to print the number of different paths via which you can climb to the top.
 */
public class ClimbingStairs_usingTabulations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int stairs = in.nextInt();
        int paths1 = climbingStairs(stairs);
        System.out.println(paths1);
        int paths2 = climbingStairs_usingMemoization(stairs,new int[stairs+1]);
        System.out.println(paths2);
        int paths3 = climbingStairs_usingTabulations(stairs);
        System.out.println(paths3);
    }
    // best approach to solve this kind of problems as this uses DP and iterative way to solve the problem
    // steps to solve
    // 1.storage and meaning ->> size of an array
    // 2.direction  ->> from where to traverse i.e where is smaller problem & how to solve big problem from smaller problem
    // 3.travel and solve in direction specified and identify the base case
    private static int climbingStairs_usingTabulations(int stairs) {
        int[] dp = new int[stairs+1];  // storage
        dp[0] = 1;                     // meaning
        for(int i=1;i<dp.length;i++){  // direction
            if(i==1){
                dp[i] = dp[i-1];
            }else if(i==2){
                dp[i] = dp[i-1] + dp[i-2];              // travel and solve
            }else{
                dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
            }
        }
        return dp[stairs];
    }

    private static int climbingStairs_usingMemoization(int stairs, int[] ints) {   // using extra array of size stairs+1 so that no need to repeat
        if(stairs==0){                                                             // calls again better approach than climbingStairs(stairs) function
            return 1;
        }if(stairs<0){
            return 0;
        }
        if(ints[stairs]>0){
            return ints[stairs];
        }
        int nm1 =climbingStairs_usingMemoization(stairs-1,ints);
        int nm2 = climbingStairs_usingMemoization(stairs-2,ints);
        int nm3 = climbingStairs_usingMemoization(stairs-3,ints);
        int paths = nm1 + nm2 + nm3;
        ints[stairs] = paths;
        return paths;
    }

    private static int climbingStairs(int stairs) {
        if(stairs==0){
            return 1;
        }if(stairs<0){
            return 0;
        }

        int nm1 = climbingStairs(stairs-1);
        int nm2 = climbingStairs(stairs-2);
        int nm3 = climbingStairs(stairs-3);
        int paths = nm1 + nm2 + nm3;
        return paths;
    }
}
