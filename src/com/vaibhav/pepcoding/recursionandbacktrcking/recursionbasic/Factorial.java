package com.vaibhav.pepcoding.recursionandbacktrcking.recursionbasic;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num =in.nextInt();
        int fact = printFact(num);
        System.out.println(fact);
    }
    // recursive logic
    // fact(n) = n * fact(n-1)
    private static int  printFact(int num) {
        if(num==0 || num==1){
            return 1;
        }
        int step = printFact(num-1);
        int fact = num * step ;
        return fact;
    }
}
