package com.vaibhav.pepcoding.arrays;

import java.util.Arrays;
import java.util.Scanner;

//Inverse of an Array
public class Arrays7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int[] arr = new int[num];
        for(int i=0;i<num;i++){
            arr[i]=in.nextInt();
        }
        inverse(arr);
    }

    private static void inverse(int[] arr) {
        int[] newarr = new int[arr.length];
        for(int i=0;i< arr.length;i++){
            int temp = arr[i];
            newarr[temp] = i;
        }
        System.out.println(Arrays.toString(newarr));
    }
}
