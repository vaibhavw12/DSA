package com.vaibhav.pepcoding.recursionandbacktrcking.recursionbasic;

import java.util.Scanner;

// lograithmic time complexcity
public class LograithmicPower {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num =in.nextInt();
        int pow = in.nextInt();
        int fact = powerLograithmic(num,pow);
        System.out.println(fact);
    }

    private static int powerLograithmic(int num, int pow) {
        if(pow==0){
            return 1;
        }
        int call =powerLograithmic(num,pow/2);
        int rs = call * call ;
        if(pow%2==1){                 // if pow is odd then multiply rs with num once
            rs = rs * num;
        }
        return rs;
    }
}
