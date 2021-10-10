package com.vaibhav.pepcoding.recursionandbacktrcking.recursioninarrays;

import java.util.Scanner;

public class DisplayArrayinReverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7,8,9};
        displayArray(arr,0);
    }
    // recursive logic
    // f(arr,0) = f(arr,i+1) + print(0 element)
    private static void displayArray(int[] arr, int i) {
        if(i==arr.length){
            return;
        }
        displayArray(arr,i+1);
        System.out.println(arr[i]);
    }
}
