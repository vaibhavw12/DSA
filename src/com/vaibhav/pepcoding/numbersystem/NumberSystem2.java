package com.vaibhav.pepcoding.numbersystem;

import java.util.Scanner;

//converting any base to decimal
public class NumberSystem2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int base = in.nextInt();
        System.out.println(baseToDecimal(number,base));
    }

    private static int baseToDecimal(int number, int base) {
        int result = 0 , p=0;
        while(number>0){
            int d = number % 10;
            number = number / 10 ;
            result = (int) (result + d * Math.pow(base,p));
            p++;
        }
        return result;

    }
}
