package com.vaibhav.pepcoding.timeandspacecomplexcity;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {4,6,31,1,68,3,13,56,7,8};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    // time complexity
    // best case          average case           worst case
    // O(N)               O(N*N)                 O(N*N)
    // space complexity O(1)
    private static void bubbleSort(int[] arr) {
        for(int i=0;i<arr.length;i++){
            boolean b = true;
            for(int j=0;j< arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                    b = false;
                }
            }
            if(b){
                return;
            }
        }
    }

    public static void swap(int[] arr, int back, int front) {
        int temp = arr[back];
        arr[back] = arr[front];
        arr[front] = temp;
    }
}
