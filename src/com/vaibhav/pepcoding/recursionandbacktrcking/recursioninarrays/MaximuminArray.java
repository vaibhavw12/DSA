package com.vaibhav.pepcoding.recursionandbacktrcking.recursioninarrays;

import java.util.Scanner;

public class MaximuminArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {67,19,17,33,5,161,3};
        int max = maxinArray(arr,0);
        System.out.println(max);
    }
    // recursive logic
    // f(arr,0) = f(arr,i+1) -> will give me max betn 1 to last + then compare arr[index] with return max of f(arr,i+1) then return final max
    private static int maxinArray(int[] arr, int i) {
        if(i==arr.length-1){
            return arr[i];
        }
        int maxBetn0tolast = maxinArray(arr,i+1);
        if(maxBetn0tolast > arr[i]){
            return maxBetn0tolast;
        }else{
            return arr[i];
        }
    }
}
