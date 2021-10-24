package com.vaibhav.pepcoding.timeandspacecomplexcity;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {4,6,31,1,68,3,13,56,7,8};
        int[] result = mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(result));
    }
    // time complexity O(N*Log(N))
    // space complexity O(N)
    private static int[] mergeSort(int[] arr, int start, int end) {
        if(start==end){
            int[] temp = new int[1];
            temp[0] = arr[start];
            return temp;
        }
        // divides array into two halves for each pass virtually
        int mid = (start + end)/2;
        int[] prev = mergeSort(arr,start,mid);
        int[] next = mergeSort(arr,mid+1,end);
        int[] result = mergetwoSortedArray(prev,next);
        return result;
    }
    private static int[] mergetwoSortedArray(int[] arr1, int[] arr2) {
        int[] arr = new int[arr1.length+arr2.length];
        int i=0,j=0;
        for(int k=0;k<arr.length;k++){
            if(i<arr1.length && j<arr2.length){
                if(arr1[i]>arr2[j]){
                    arr[k] = arr2[j];
                    j++;
                }else {
                    arr[k] = arr1[i];
                    i++;
                }
            }else if(i==arr1.length){
                arr[k] = arr2[j];
                j++;
            }else if(j==arr2.length){
                arr[k] = arr1[i];
                i++;
            }
        }
        return arr;
    }
}
