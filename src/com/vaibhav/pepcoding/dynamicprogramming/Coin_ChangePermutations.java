package com.vaibhav.pepcoding.dynamicprogramming;

import java.util.Scanner;
/*
1. You are given a number n, representing the count of coins.
2. You are given n numbers, representing the denominations of n coins.
3. You are given a number "amt".
4. You are required to calculate and print the number of permutations of the n coins using which the
     amount "amt" can be paid.

Note1 -> You have an infinite supply of each coin denomination i.e. same coin denomination can be
                  used for many installments in payment of "amt"
Note2 -> You are required to find the count of permutations and not combinations i.e.
                  2 + 2 + 3 = 7 and 2 + 3 + 2 = 7 and 3 + 2 + 2 = 7 are different permutations of same
                  combination. You should treat them as 3 and not 1.
 */
public class Coin_ChangePermutations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int coins = in.nextInt();
        int[] coins_arr = new int[coins];
        for(int i=0;i<coins;i++){
            coins_arr[i] = in.nextInt();
        }
        int target = in.nextInt();
        int[] dp = new int[target+1];                      // storage
        dp[0] = 1;                                        // meaning
        // we are storing in each cell of dp : how many permutations are there for that target using all given coins
        for(int i=1;i<dp.length;i++){                      // direction
            for(int j=0;j<coins_arr.length;j++){
                if(i>=coins_arr[j]){
                    dp[i] += dp[i-coins_arr[j]];
                }
            }
        }
        System.out.println(dp[target]);
    }
}
