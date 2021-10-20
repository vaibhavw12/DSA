package com.vaibhav.pepcoding.recursionandbacktrcking.recursion_onthewayup;

import java.util.Scanner;

/*
1. You are given a number n representing number of stairs in a staircase.
2. You are standing at the bottom of staircase. You are allowed to climb 1 step, 2 steps or 3 steps in one move.
display total paths you can get to climb the stairs using above conditions
 */
public class PrintStairPaths {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int stairs = in.nextInt();
        printStairPaths(stairs,"");
    }
    // try to think on levels and option for this kind of recursive problem
    private static void printStairPaths(int stairs, String path) {
        if(stairs == 0){
            System.out.println(path);
            return;
        }
        if(stairs < 0){
            return;
        }
//        printStairPaths(stairs-1,path + 1);
//        printStairPaths(stairs-2,path + 2);
//        printStairPaths(stairs-3,path + 3);
        // using loop will also work
        for(int i=1;i<=3;i++){
            printStairPaths(stairs-i,path + i);
        }
    }
}
