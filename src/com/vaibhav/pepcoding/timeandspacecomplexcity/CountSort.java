package com.vaibhav.pepcoding.timeandspacecomplexcity;

import com.vaibhav.pepcoding.arrays.Arrays1;

import java.util.Arrays;
import java.util.Scanner;

// count sort is a stable sort which mostly works for repeated elements within small range
// count sort preserved the order as it was
public class CountSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {4,6,2,2,3,4,6,9,2,7,4};
        countSort(arr);
    }

    private static void countSort(int[] arr) {
        int range = Arrays1.span(arr);
        range++;
        int[] frequencyArr = new int[range];
        int min = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            int element = arr[i];       // for every element in an array
            int index = element - min;  // for index in frequencyArr
            frequencyArr[index]++;      // updating frequency of that element
        }
        // prefix sum
        for(int i=1;i<frequencyArr.length;i++){
            frequencyArr[i] += frequencyArr[i-1];
        }
        int[] result = new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            int element = arr[i];         // value from last
            int index = element - min;    // its frequency in frequencyArr
            frequencyArr[index]--;        // -1 as we are adding one value to result array
            result[frequencyArr[index]] = element;
        }
        System.out.println(Arrays.toString(result));
    }
}
