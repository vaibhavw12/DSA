package com.vaibhav.pepcoding.timeandspacecomplexcity;

import java.util.Arrays;
import java.util.Scanner;

public class MergetwoSortedArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr1 = {1, 3, 4, 6, 7, 8, 13,29, 31, 56, 68};
        int[] arr2 = {2,5,6,8,14,16,18,25,501,563};
        mergetwoSortedArray(arr1,arr2);
    }
    // time complexity O(N)
    // space complexity O(N)
    private static void mergetwoSortedArray(int[] arr1, int[] arr2) {
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
        System.out.println(Arrays.toString(arr));
    }
}
