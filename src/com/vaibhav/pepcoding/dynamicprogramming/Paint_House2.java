package com.vaibhav.pepcoding.dynamicprogramming;

import java.util.Scanner;
/*
1. You are given a number n and a number k separated by a space, representing the number of houses and number of colors.
2. In the next n rows, you are given k space separated numbers representing the cost of painting nth house with one of the k colors.
3. You are required to calculate and print the minimum cost of painting all houses without painting any consecutive house with same color.

Constraints

1 <= n <= 1000
1 <= k <= 10
0 <= n1-0th, n1-1st, .. <= 1000

Format

Input

A number n
n1-0th n1-1st n1-2nd .. n1-kth
n2-0th n2-1st n2-2nd .. n2-kth
.. n number of elements

Output

A number representing the minimum cost of painting all houses without painting any consecutive house with same color.

Example

Sample Input

4 3
1 5 7
5 8 4
3 2 9
1 2 4

Sample Output

82
 */
public class Paint_House2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int houses = in.nextInt();
        int colors = in.nextInt();
        int[][] arr = new int[houses][colors];
        for(int i=0;i<houses;i++){
            for(int j=0;j<colors;j++){
                arr[i][j] = in.nextInt();
            }
        }
        int[][] dp = new int[houses][colors];
        for(int j=0;j<colors;j++){
            dp[0][j] = arr[0][j];
        }
        for(int i=1;i<houses;i++){
            for(int j=0;j<colors;j++){
                int min = Integer.MAX_VALUE;
                for(int k=0;k<colors;k++){
                    if(j!=k){
                        if(dp[i-1][k]<min){
                            min = dp[i-1][k];
                        }
                    }
                }
                dp[i][j] = arr[i][j] + min;
            }
        }
        int mini = Integer.MAX_VALUE;
        for(int j=0;j<colors;j++){
            if(dp[houses-1][j]<mini){
                mini = dp[houses-1][j];
            }
        }
        System.out.println(mini);
    }
}
