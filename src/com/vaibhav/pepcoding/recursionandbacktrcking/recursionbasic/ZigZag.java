package com.vaibhav.pepcoding.recursionandbacktrcking.recursionbasic;

import java.util.Scanner;

public class ZigZag {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num =in.nextInt();
        printZigZag(num);
    }
    // recursive approach
    // how to recursive calls works in the memory
    // synthesis can be simplified using recursion tree
    // pre ,in and post statements , stack content ,order of recursive calls
    // until all the stack + all lines of that recursive call not finished till then recursion works
    private static void printZigZag(int num) {
        if(num==0){
            return;
        }
        System.out.print("pre-"+num+",");          // line 1 ->> left part of recursive tree
        printZigZag(num-1);                  // line 2 -> recursive call 1
        System.out.print("in-"+num+",");           // line 3 ->> middle part of recursive tree
        printZigZag(num-1);                  // line 4  -> recursive call 2
        System.out.print("post-"+num+",");         // line 5 ->> right part of recursive tree
    }
}
