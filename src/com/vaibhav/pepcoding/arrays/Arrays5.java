package com.vaibhav.pepcoding.arrays;

import java.util.Arrays;
import java.util.Scanner;

//reverse an array
public class Arrays5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int[] arr = new int[num];
        for(int i=0;i<num;i++){
            arr[i]=in.nextInt();
        }
        reverse(arr);
    }

    private static void reverse(int[] arr) {
        int start = 0, end = arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++ ; end-- ;
        }
        System.out.println(Arrays.toString(arr));
    }
}
