package com.vaibhav.pepcoding.dynamicprogramming;

import java.util.Scanner;
/*
1. You are given a number n and a number m separated by line-break representing the length and breadth of a m * n floor.
2. You've an infinite supply of m * 1 tiles.
3. You are required to calculate and print the number of ways floor can be tiled using tiles.

Constraints

1 <= n <= 100
1 <= m <= 50

Format

Input

A number n
A number m

Output

A number representing the number of ways in which the number of ways floor can be tiled using tiles.

Example

Sample Input

39
16

Sample Output

61
 */
public class Tiling_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int[] dp = new int[n+1];
        for(int i=1;i<=n;i++){
            if(i<m){
                dp[i] = 1;
            }else if(i==m){
                dp[i] = 2;
            }else{
                dp[i] = dp[i-1] + dp[i-m];
            }
        }
        System.out.println(dp[n]);
    }
}
