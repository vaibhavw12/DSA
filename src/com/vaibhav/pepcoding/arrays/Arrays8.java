package com.vaibhav.pepcoding.arrays;

import java.util.Scanner;

//SubArrays of an arrays
public class Arrays8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String num = in.next();
        char[] arr;
        arr = num.toCharArray();
        displaySubArrays(arr);
    }

    private static void displaySubArrays(char[] arr) {
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+"\t");
            for(int j=i+1;j<arr.length;j++){
                int k=i+1;
                System.out.print(arr[i]);
                while(k<=j){
                    System.out.print(arr[k]);
                    k++;
                }
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}
