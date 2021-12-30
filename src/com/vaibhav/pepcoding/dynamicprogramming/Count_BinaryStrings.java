package com.vaibhav.pepcoding.dynamicprogramming;

import java.util.Scanner;
/*
1. You are given a number n.
2. You are required to print the number of binary strings of length n with no consecutive 0's.

Constraints

0 < n <= 45

Format

Input

A number n

Output

A number representing the number of binary strings of length n with no consecutive 0's.

Example

Sample Input

6

Sample Output

21
 */
public class Count_BinaryStrings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        // storage and meaning no need for array
        int old_count_0 = 1;
        int old_count_1 = 1;
        for(int i=2;i<=count;i++){
            int new_count_1 = old_count_1 + old_count_0;
            int new_count_0 = old_count_1;
            old_count_0 = new_count_0;
            old_count_1 = new_count_1;
        }
        System.out.println(old_count_0+old_count_1);
    }
}
