package com.vaibhav.pepcoding.arrays;

import java.util.Scanner;

//Span of an Array
public class Arrays1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int[] arr = new int[num];
        for(int i=0;i<num;i++){
            arr[i]=in.nextInt();
        }
        int result = span(arr);
        System.out.println(result);
    }
    private static int span(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }if(arr[i]<min){
                min = arr[i];
            }
        }
        return max-min;
    }
}
