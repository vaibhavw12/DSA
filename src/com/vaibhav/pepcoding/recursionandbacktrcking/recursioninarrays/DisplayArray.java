package com.vaibhav.pepcoding.recursionandbacktrcking.recursioninarrays;

import java.util.Scanner;

public class DisplayArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7,8,9};
        displayArray(arr,0);
    }
    // recursive logic
    // f(arr,0) = print(0 element) + f(arr,i+1)
    private static void displayArray(int[] arr, int i) {
        if(i==arr.length){
            return;
        }
        System.out.println(arr[i]);
        displayArray(arr,i+1);
    }
}
