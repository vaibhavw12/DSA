package com.vaibhav.pepcoding.timeandspacecomplexcity;

import java.util.Arrays;
import java.util.Scanner;

public class RadixSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {134,12,134,345,56,768,7694,6,22,4890,3,245,32,18,436};
        radixSort(arr);
    }

    private static void radixSort(int[] arr) {
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        int exp = 1;
        while(exp<=max){
            countSort(arr,exp);
            exp*= 10;
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void countSort(int[] arr, int exp) {
        int[] frequencyArr = new int[10];            // as 10 digit may present in array
        for(int i=0;i<arr.length;i++){
            int element = (arr[i] / exp) % 10 ;       // for every digit in an array
            int index = element;                        // for index in frequencyArr
            frequencyArr[index]++;                      // updating frequency of that element
        }
        // prefix sum
        for(int i=1;i<frequencyArr.length;i++){
            frequencyArr[i] += frequencyArr[i-1];
        }
        int[] result = new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            int index = (arr[i] / exp) % 10 ;         // value from last
            int element = arr[i];                   // original element in arr
            frequencyArr[index]--;                  // -1 as we are adding one value to result array
            result[frequencyArr[index]] = element;
        }
        for(int i=0;i<arr.length;i++){
            arr[i] = result[i];                 // for every iteration arr elements are modified respect to last digit by applying
        }                                       // count sort on them
    }
}
