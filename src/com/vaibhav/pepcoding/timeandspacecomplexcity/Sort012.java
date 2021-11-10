package com.vaibhav.pepcoding.timeandspacecomplexcity;

import java.util.Arrays;
import java.util.Scanner;

public class Sort012 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {1,0,1,2,2,1,0,0,1,2,1,2,0,0,2,1,0,2,1};
        sort012(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort012(int[] arr) {
        int i=0;                 // 0 to j-1 , i++ ->> all 0's
        int j=0;                 // j to k-1 , j++,i++ ->> all 1's
        int k=arr.length-1;      // k to arr.length-1 , k--  ->> all 2's
        // from i to k all unknowns
        while(i<=k){
            if(arr[i]==0){
                BubbleSort.swap(arr,j,i);
                i++;j++;
            }else if(arr[i]==1){
                i++;
            }else{
                BubbleSort.swap(arr,i,k);
                k--;
            }
        }
    }
}
