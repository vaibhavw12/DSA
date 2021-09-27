package com.vaibhav.pepcoding;

import java.util.Scanner;

//multiplication of any base
public class NumberSystem6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int base = in.nextInt();
        int result = multiplicationOfAnyBase(num1,num2,base);
        System.out.println(result);
    }

    private static int multiplicationOfAnyBase(int num1, int num2, int base) {
        int rv = 0, p = 1;
        while(num2>0){
            int d2 = num2 % 10;
            num2 = num2 / 10;
            int result = multiplyBySingleDigit(num1,d2,base);
            rv = NumberSystem4.additionOfAnyBase(rv,result * p,base);
            p = p* 10;
        }
        return rv;
    }
    private static int multiplyBySingleDigit(int num1 ,int d2, int base ){
        int result = 0,c = 0, p = 1, sum =0;
        while(num1>0 || c>0){
            int d = num1 % 10;
            num1 = num1 /10;
            int temp = d2 * d +c;
            c = temp / base ;
            temp = temp % base ;
            result = result + temp * p;
            p = p * 10;
        }
        return result ;
    }
}
