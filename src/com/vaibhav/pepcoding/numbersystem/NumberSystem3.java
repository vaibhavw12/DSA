package com.vaibhav.pepcoding.numbersystem;

import java.util.Scanner;

//conversion any base1 to any base2
public class NumberSystem3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int base1 = in.nextInt();
        //first convert num1,base1 into decimal then that decimal into num2 at given base2
        int base2 = in.nextInt();
        int result = base1ToBase2(num1,base1,base2);
        System.out.println(result);
    }

    private static int base1ToBase2(int num1, int base1, int base2) {
        int decimal = 0, p =0, num2 = 0;
        while(num1>0){
            int d = num1 % 10 ;
            decimal = (int) (decimal + d *  Math.pow(base1,p));
            p++;
            num1 = num1 / 10;
        }
        p = 1;
        while(decimal>0){
            int d = decimal % base2;
            num2 = num2 + d * p;
            p = p*10;
            decimal = decimal / base2;
        }
        return num2;
    }
}
