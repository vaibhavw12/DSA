package com.vaibhav.pepcoding.dynamicprogramming;

import java.util.Scanner;

/*
1. You are given a number n, which represents the length of a road. The road has n plots on it's each side.
2. The road is to be so planned that there should not be consecutive buildings on either side of the road.
3. You are required to find and print the number of ways in which the buildings can be built on both side of roads.

Constraints

0 < n <= 45

Format

Input

A number n

Output

A number representing the number of ways in which the buildings can be built on both side of roads.

Example

Sample Input

6

Sample Output

441
 */
public class Arrange_Buildings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int plots = in.nextInt();

        long old_building = 1;
        long old_space = 1;
        for(int i=2;i<=plots;i++){
            long new_building = old_space;
            long new_space = old_space + old_building;
            old_building = new_building;
            old_space = new_space;
        }
        long total = old_building+old_space;
        System.out.println(total*total);
    }
}
