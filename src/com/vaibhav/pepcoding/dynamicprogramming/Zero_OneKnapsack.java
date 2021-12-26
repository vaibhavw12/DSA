package com.vaibhav.pepcoding.dynamicprogramming;

import java.util.Scanner;
/*
1. You are given a number n, representing the count of items.
2. You are given n numbers, representing the values of n items.
3. You are given n numbers, representing the weights of n items.
3. You are given a number "cap", which is the capacity of a bag you've.
4. You are required to calculate and print the maximum value that can be created in the bag without
     overflowing it's capacity.

Note -> Each item can be taken 0 or 1 number of times. You are not allowed to put the same item
               again and again.

Constraints

1 <= n <= 20
0 <= v1, v2, .. n elements <= 50
0 < w1, w2, .. n elements <= 10
0 < cap <= 10

Format

Input

A number n
v1 v2 .. n number of elements
w1 w2 .. n number of elements
A number cap

Output

A number representing the maximum value that can be created in the bag without overflowing it's capacity

Example

Sample Input

5
15 14 10 45 30
2 5 1 3 4
7

Sample Output

75
 */
public class Zero_OneKnapsack {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        int[] values = new int[count];
        for(int i=0;i<count;i++){
            values[i] = in.nextInt();
        }
        int[] weight = new int[count];
        for(int i=0;i<count;i++){
            weight[i] = in.nextInt();
        }
        int capacity = in.nextInt();

        int[][] dp = new int[count+1][capacity+1];
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                if(j>=weight[i-1]){

                    if(dp[i-1][j-weight[i-1]]+values[i-1]>=dp[i-1][j]){
                        dp[i][j] = dp[i-1][j-weight[i-1]]+values[i-1];
                    }else{
                        dp[i][j] = dp[i-1][j];
                    }
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        System.out.println(dp[count][capacity]);
    }
}
