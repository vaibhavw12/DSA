package com.vaibhav.pepcoding;

import java.util.Scanner;

//Substraction of any base
public class NumberSystem5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int base = in.nextInt();
        int result = substractionOfAnyBase(num1,num2,base);
        System.out.println(result);
    }

    private static int substractionOfAnyBase(int num1, int num2, int base) {
        int result = 0 ,c = 0, p=1 ;
        while(num2>0){
            int d1 = num1 % 10;
            int d2 = num2 % 10 ;
            num1 = num1 /10;
            num2 = num2/10;
            int d=0;
            d2 = d2 + c;
            if(d1<=d2){
                d = d2 - d1 ;
            }else{
                c = -1 ;
                d = d2 + base - d1;
            }
            result = result + d * p;
            p = p* 10;
        }
        return result;
    }
}
