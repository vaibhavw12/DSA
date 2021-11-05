package com.vaibhav.pepcoding.timeandspacecomplexcity;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {454,35,7,52,435,76,21,4,5,677,85,44,3,543,2333,3,343,676,221,177,88,233,4514};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr,int start,int end) {
        if(start>=end){
            return;
        }
        int pivot = partitation(arr,start,end);
        quickSort(arr,pivot+1,end);
        quickSort(arr,start,pivot-1);
    }

    private static int partitation(int[] arr, int start, int end) {
        int pivot = end,index =start;
        while(start<end){
            if(arr[start]>arr[pivot]){
                start++;
            }else {
                BubbleSort.swap(arr,index,start);
                index++;start++;
            }
        }
        BubbleSort.swap(arr,index,pivot);
        return index;
    }

}
