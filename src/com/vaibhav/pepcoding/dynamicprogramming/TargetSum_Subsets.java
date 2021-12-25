package com.vaibhav.pepcoding.dynamicprogramming;

import java.util.Scanner;

/*
1. You are given a number n, representing the count of elements.
2. You are given n numbers.
3. You are given a number "tar".
4. You are required to calculate and print true or false, if there is a subset the elements of which add
     up to "tar" or not.
 */
public class TargetSum_Subsets {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        int target = in.nextInt();

        boolean[][] dp = new boolean[n+1][target+1];                // storage

        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                if(i==0 && j==0){
                    dp[i][j] = true;
                }else if(i==0){
                    dp[i][j] = false;
                }else if(j==0){
                    dp[i][j] = true;
                }else{
                    if(dp[i-1][j] == true){          // current not included
                        dp[i][j] = true;
                    }else{
                        int value = arr[i-1];       // as index start from i=1 for arr in dp[i]
                        if(j >= value){             // current included
                            if(dp[i-1][j-value] == true){   // check for condition
                                dp[i][j] = true;
                            }else{
                                dp[i][j] = false;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(dp[dp.length-1][dp[0].length-1]);
    }
}
