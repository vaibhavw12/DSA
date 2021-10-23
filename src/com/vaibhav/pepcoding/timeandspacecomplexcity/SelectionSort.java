package com.vaibhav.pepcoding.timeandspacecomplexcity;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {4,6,31,1,68,3,13,56,7,8};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    // time complexity
    // best case          average case           worst case
    // O(N*N)               O(N*N)                 O(N*N)
    // space complexity O(1)
    private static void selectionSort(int[] arr) {
        for(int i=0;i<arr.length;i++){
            int min = arr[i];
            int index = i;
            for(int j=i+1;j< arr.length;j++){
                if(arr[j]<min){
                    min = arr[j];
                    index = j;
                }
            }
            BubbleSort.swap(arr,i,index);
        }
    }
}
