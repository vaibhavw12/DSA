package com.vaibhav.pepcoding.dynamicprogramming;

import java.util.Scanner;
/*
1. You are given a number n representing the length of a floor space which is 2m wide. It's a 2 * n board.
2. You've an infinite supply of 2 * 1 tiles.
3. You are required to calculate and print the number of ways floor can be tiled using tiles.

Constraints

1 <= n <= 100

Format

Input

A number n

Output

A number representing the number of ways in which the number of ways floor can be tiled using tiles.

Example

Sample Input

8

Sample Output

34
 */
public class Tiling_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int[] dp =new int[length+1];

        dp[1] = 1;
        dp[2] = 2;
        for(int i=3;i<=length;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        System.out.println(dp[length]);
    }
}
