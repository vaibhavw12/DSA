package com.vaibhav.pepcoding.timeandspacecomplexcity;

import java.util.Arrays;
import java.util.Scanner;

// dates given in DDMMYYYY format sort accordingly
public class SortDates {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] arr = {"31041996" ,"20101996" ,"05061997" ,"12041989" ,"11081987"};
        sortDates(arr);
    }

    private static void sortDates(String[] arr) {
        countSort(arr,1000000,100,32); // sorting according to date
        countSort(arr,10000,100,13);   // sorting according to month
        countSort(arr,1,10000,2000);   // sorting according to year
        System.out.println(Arrays.toString(arr));
    }
    // count sort according to date,month and year by preference
    private static void countSort(String[] arr, int div, int modulo,int size) {
        int[] frequencyArr = new int[size];            // as 10 digit may present in array
        for(int i=0;i<arr.length;i++){
            int element = (Integer.parseInt(arr[i],10) / div) % modulo ;       // for every pattern in an array
            int index = element;                                                    // for index in frequencyArr
            frequencyArr[index]++;                                                  // updating frequency of that element
        }
        // prefix sum
        for(int i=1;i<frequencyArr.length;i++){
            frequencyArr[i] += frequencyArr[i-1];
        }
        String[] result = new String[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            int index = (Integer.parseInt(arr[i],10) / div) % modulo ;         // value from last
            String element = arr[i];                                                   // original element in arr
            frequencyArr[index]--;                                                  // -1 as we are adding one value to result array
            result[frequencyArr[index]] = element;
        }
        for(int i=0;i<arr.length;i++){
            arr[i] = result[i];                 // for every iteration arr elements are modified respect to last digit by applying
        }                                       // count sort on them
    }

}
