package com.vaibhav.pepcoding.dynamicprogramming;

import java.util.Scanner;

/*
1. You are given a number n and a number k in separate lines, representing the number of fences and number of colors.
2. You are required to calculate and print the number of ways in which the fences could be painted so that not more than two consecutive  fences have same colors.

Constraints

1 <= n <= 10
1 <= k <= 10

Format

Input

A number n
A number k

Output

A number representing the number of ways in which the fences could be painted so that not more than two fences have same colors.

Example

Sample Input

8
3

Sample Output

3672
 */
public class Paint_Fenece {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int fenece = in.nextInt();
        int colors = in.nextInt();

        long consecutive_same = colors *1;
        long consecutive_diff = colors * (colors -1);
        long total_ways = consecutive_same + consecutive_diff;
        for(int i=2;i<fenece;i++){
            consecutive_same = consecutive_diff;
            consecutive_diff = total_ways * (colors - 1);
            total_ways = consecutive_diff + consecutive_same;
        }
        System.out.println(total_ways);
    }
}
