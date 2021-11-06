package com.vaibhav.pepcoding.timeandspacecomplexcity;

import java.util.Scanner;
// finding k largest element in Unsorted Array
public class QuickSelect {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {4,6,31,1,68,3,13,56,7,8};
        int k = in.nextInt();
        int result = quickSelect(arr,k,0,arr.length-1);
        System.out.println(result);
    }

    private static int quickSelect(int[] arr, int k, int start, int end) {
        int pivot = QuickSort.partitation(arr,start,end);
        if(pivot==k){
            return arr[pivot];
        }else if(pivot<k){
            return quickSelect(arr,k,pivot+1,end);
        }else {
            return quickSelect(arr,k,start,pivot-1);
        }
    }

}
