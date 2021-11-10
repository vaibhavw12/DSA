package com.vaibhav.pepcoding.timeandspacecomplexcity;

import java.util.Arrays;
import java.util.Scanner;

public class Sort01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {1,1,0,1,1,1,0,0,1,0,1,0,0,1,0,0,0,1,1};
        sort01(arr);
        System.out.println(Arrays.toString(arr));
    }
    // simple partition logic
    private static void sort01(int[] arr) {
        for(int i=0,j=0;i<arr.length;i++){
            if(arr[i]==0){
                BubbleSort.swap(arr,i,j);
                j++;
            }
        }
    }
}
