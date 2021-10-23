package com.vaibhav.pepcoding.timeandspacecomplexcity;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {4,6,31,1,68,3,13,56,7,8};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    // time complexity
    // best case          average case           worst case
    // O(N)               O(N*N)                 O(N*N)
    // space complexity O(1)
    private static void insertionSort(int[] arr) {
        for(int i=1;i<arr.length;i++){
            int j=i;;
            while(j>0 && arr[j-1]>arr[j]){
                BubbleSort.swap(arr,j-1,j);
                j--;
            }
        }
    }
}
