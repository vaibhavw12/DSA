package com.vaibhav.pepcoding.timeandspacecomplexcity;

import java.util.Arrays;
import java.util.Scanner;

public class TargetSumPair {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {9,-48 ,100 ,43 ,84 ,74 ,86 ,34 ,-37 ,60 ,-29 ,44};
        int sum = in.nextInt();
        targetSumPair(arr,sum);
    }
    // time complexity O(nlog(n))
    private static void targetSumPair(int[] arr, int sum) {
        Arrays.sort(arr); // sort in O(nlog(n))
        int low = 0;
        int high = arr.length-1;
        while (low<high){
            if(sum < arr[high] + arr[low]){
                high--;
            }else if(sum > arr[high] + arr[low]){
                low++;
            }else {
                System.out.println(arr[high]+","+arr[low]);
                low++;high--;
            }
        }

    }
}
