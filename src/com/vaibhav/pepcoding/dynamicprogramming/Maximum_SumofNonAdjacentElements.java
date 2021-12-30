package com.vaibhav.pepcoding.dynamicprogramming;

import java.util.Scanner;

/*
1. You are given a number n, representing the count of elements.
2. You are given n numbers, representing n elements.
3. You are required to find the maximum sum of a subsequence with no adjacent elements.

Constraints

1 <= n <= 1000
-1000 <= n1, n2, .. n elements <= 1000

Format

Input

A number n
n1
n2
.. n number of elements

Output

A number representing the maximum sum of a subsequence with no adjacent elements.

Example

Sample Input

6
5
10
10
100
5
6

Sample Output

116
 */
public class Maximum_SumofNonAdjacentElements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        int[] arr = new int[count];
        for(int i=0;i<count;i++){
            arr[i] = in.nextInt();
        }

        int include = arr[0];
        int exclude = 0;
        for(int i=1;i<count;i++){
            int new_include = exclude + arr[i];
            int new_exclude = Math.max(include,exclude);
            exclude = new_exclude;
            include = new_include;
        }
        System.out.println(Math.max(exclude,include));
    }
}
