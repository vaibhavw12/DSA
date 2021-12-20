package com.vaibhav.pepcoding.dynamicprogramming;

import java.util.Scanner;

/*
1. You are given a number n, representing the number of rows.
2. You are given a number m, representing the number of columns.
3. You are given n*m numbers, representing elements of 2d array a, which represents a gold mine.
4. You are standing in front of left wall and are supposed to dig to the right wall. You can start from
     any row in the left wall.
5. You are allowed to move 1 cell right-up (d1), 1 cell right (d2) or 1 cell right-down(d3).
6. Each cell has a value that is the amount of gold available in the cell.
7. You are required to identify the maximum amount of gold that can be dug out from the mine.
 */
public class Goldmine {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] mat = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                mat[i][j] = in.nextInt();            //Each cell has a value that is the amount of gold available in the cell
            }
        }

        int[][] dp = new int[n][m];                          // storage
        for(int j=m-1;j>=0;j--){                            // direction
            for(int i=n-1;i>=0;i--){
                if(j==m-1){
                    dp[i][j] = mat[i][j];                  // meaning   ->> for last column
                }else if(i==n-1){
                    dp[i][j] = mat[i][j] + Math.max(dp[i][j+1],dp[i-1][j+1]);              //  for last row
                }else if(i==0){
                    dp[i][j] = mat[i][j] + Math.max(dp[i][j+1],dp[i+1][j+1]);               // for first row
                }else{
                    dp[i][j] = mat[i][j] + Math.max(dp[i][j+1],Math.max(dp[i-1][j+1],dp[i+1][j+1]));        // for remaining all
                }
            }
        }
        // ans will be max in its first column
        int max = dp[0][0];
        for(int i=1;i<n;i++){
            if(dp[i][0]>max){
                max = dp[i][0];
            }
        }
        System.out.println(max);
    }
}
