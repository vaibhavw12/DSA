package com.vaibhav.pepcoding.timeandspacecomplexcity;

import java.util.Arrays;
import java.util.Scanner;

public class PartitioningArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {454,35,7,52,435,76,21,4,5,677,85,44,3,543,2333,3,343,676,221,177,88,233,451,35};
        int pivot = in.nextInt();
        partitioningArray(arr,pivot);
        System.out.println(Arrays.toString(arr));
    }

    private static void partitioningArray(int[] arr, int pivot) {
        int i=0,j=0;
        while(i<arr.length){
            if(arr[i]>pivot){
                i++;
            }else{
                BubbleSort.swap(arr,j,i);
                i++;j++;
            }
        }
    }
}
