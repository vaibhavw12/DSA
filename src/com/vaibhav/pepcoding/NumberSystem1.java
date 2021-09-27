package com.vaibhav.pepcoding;

import java.util.Scanner;

//converting decimal to any base
public class NumberSystem1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int decimal = in.nextInt();
        int base = in.nextInt();   //enter any base for conversion of decimal number
        System.out.println(decimalToBase(decimal,base));
    }

    private static int decimalToBase(int decimal, int base) {
        int number = 0,p = 1;
        while(decimal>0){
            int d = decimal % base ;   //divide it with base
            number = number + d * p;   //add base to number
            p = p * 10;

            decimal = decimal / base ; //reducing decimal number for next loop

        }

        return number;
    }
}
