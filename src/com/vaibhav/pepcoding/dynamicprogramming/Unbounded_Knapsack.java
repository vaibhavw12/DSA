package com.vaibhav.pepcoding.dynamicprogramming;

import java.util.Scanner;

/*
1. You are given a number n, representing the count of items.
2. You are given n numbers, representing the values of n items.
3. You are given n numbers, representing the weights of n items.
3. You are given a number "cap", which is the capacity of a bag you've.
4. You are required to calculate and print the maximum value that can be created in the bag without
    overflowing it's capacity.
Note -> Each item can be taken any number of times. You are allowed to put the same item again
                  and again.

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

100
 */
public class Unbounded_Knapsack {
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
        // as duplicacy is alowed we will use 1D array this is a major diff betn Zero_one and Unbounded knapsack
        int[] dp = new int[capacity+1];
        dp[0] = 0;
        for (int i=1;i<=capacity;i++){
            int max = 0;
            for(int j=0;j<count;j++){
                if(i>=weight[j]){
                    int temp = dp[i - weight[j]] + values[j];
                    if(temp > max){
                        max = temp;
                    }
                }
            }
            dp[i] = max;
        }
        System.out.println(dp[capacity]);
    }
}
