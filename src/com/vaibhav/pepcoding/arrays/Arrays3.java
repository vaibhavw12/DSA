package com.vaibhav.pepcoding.arrays;

import java.util.Scanner;

//Sum of two arrays
public class Arrays3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int[] arr1 = new int[num1];
        for(int i=0;i<num1;i++){
            arr1[i]=in.nextInt();
        }
        System.out.println("next ;");
        int num2 = in.nextInt();
        int[] arr2 = new int[num2];
        for(int i=0;i<num2;i++){
            arr2[i]=in.nextInt();
        }
        sum(arr1,arr2);
    }

    private static void sum(int[] arr1, int[] arr2) {
        int i1 = arr1.length;
        int i2 = arr2.length;
        int size = (i1>i2) ? i1 : i2 ;
        int[] arr = new int[size];
        int i3 = size;
        int c = 0;i1--;i2--;i3--;
        while(i3>=0){
            int d = c;
            if(i1>=0){
                d+=arr1[i1];
            }if(i2>=0){
                d+=arr2[i2];
            }
            c = d / 10;
            d = d % 10 ;
            arr[i3]= d;
            i1--;i2--;i3--;
        }
        if(c>0){
            System.out.print(c);
        }
        for(int s : arr){
            System.out.print(s);
        }
    }
}
