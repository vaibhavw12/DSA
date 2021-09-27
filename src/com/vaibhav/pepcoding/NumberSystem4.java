package com.vaibhav.pepcoding;

import java.util.Scanner;

//Addition of any base
public class NumberSystem4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int base = in.nextInt();
        int result = additionOfAnyBase(num1,num2,base);
        System.out.println(result);
    }

    public static int additionOfAnyBase(int num1, int num2, int base) {
        int sum = 0, c = 0, p = 1;
        while(num1>0 || num2>0 || c>0){
            int d1 = num1 % 10 ;
            int d2 = num2 % 10 ;
            num1 = num1 / 10 ;
            num2 = num2 / 10 ;

            int sum1 =d1 + d2 +c;
            c = sum1 / base;
            sum1= sum1 % base ;

            sum = sum + sum1 * p;
            p = p *10;
        }
        return sum;
    }
}
