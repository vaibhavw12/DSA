package com.vaibhav.pepcoding.arrays;

import java.util.Scanner;

//Bar chart
public class Arrays2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int[] arr = new int[num];
        for(int i=0;i<num;i++){
            arr[i]=in.nextInt();
        }
        int max = findMax(arr);
     //   System.out.println(max);
        printBarChart(arr,max);
    }

    private static void printBarChart(int[] arr, int max) {
        while(max>0){
            for(int i=0;i<arr.length;i++){
                if(arr[i]>=max){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
            max--;
        }
    }

    private static int findMax(int[] arr) {
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max) {
                max = arr[i];
            }
        }
        return max;
    }
}
