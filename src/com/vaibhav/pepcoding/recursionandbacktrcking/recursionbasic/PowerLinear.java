package com.vaibhav.pepcoding.recursionandbacktrcking.recursionbasic;

import java.util.Scanner;
// Linear time complexcity
public class PowerLinear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num =in.nextInt();
        int pow = in.nextInt();
        int fact = powerLinear(num,pow);
        System.out.println(fact);
    }
    // recursive logic
    // f(n,p) = n * f(n,p-1)
    private static int powerLinear(int num, int pow) {
        if(pow==0){
            return 1;
        }
        int rs = num * powerLinear(num,pow-1);
        return rs;
    }
}
