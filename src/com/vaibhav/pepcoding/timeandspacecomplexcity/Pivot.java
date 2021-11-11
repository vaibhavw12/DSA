package com.vaibhav.pepcoding.timeandspacecomplexcity;

import java.util.Scanner;

// pivot in sorted roted array in O(logn) time complexity
public class Pivot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {30,40,50,60,10,20};
        int pivot = pivotInSortedRotedArray(arr);
        System.out.println(pivot);
    }
    //  O(logn) time complexity
    private static int pivotInSortedRotedArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while (start<end){
            int mid = (start + end) / 2;
            if(arr[mid] < arr[end]){
                end = mid;
            }else {
                start = mid+1;
            }
        }
        return arr[start];
    }
}
