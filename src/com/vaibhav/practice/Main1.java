package com.vaibhav.practice;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("enter numbers :");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        System.out.println("enter number to be searched :");
        int num = in.nextInt();
        int result = search(arr,num);
        if(result==-1){
            System.out.println(num+" is not present");
        }else{
            System.out.println(num+" is present at index "+result);
        }

    }

    private static int search(int[] arr, int num) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                return i;
            }
        }
        return -1;
    }
}
