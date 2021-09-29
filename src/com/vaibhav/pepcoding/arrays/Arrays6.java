package com.vaibhav.pepcoding.arrays;

import java.util.Arrays;
import java.util.Scanner;

//rotation of an array clockwise for k>0 and anticlockwise for k<0
public class Arrays6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int[] arr = new int[num];
        for(int i=0;i<num;i++){
            arr[i]=in.nextInt();
        }
        System.out.println("rotate array by : ");
        int k = in.nextInt();
        rotation(arr,k % arr.length);
    }

    private static void rotation(int[] arr, int k) {
//        if(k>0){
//            Arrays6.reverse(arr,arr.length-k, arr.length-1);
//            Arrays6.reverse(arr,0,arr.length-k-1);
//            Arrays6.reverse(arr,0,arr.length-1);
//        }else if (k<0){
//            k=k*-1;
//            Arrays6.reverse(arr,0,k-1);
//            Arrays6.reverse(arr,k,arr.length-1);
//            Arrays6.reverse(arr,0,arr.length-1);
//        }else{}
//        System.out.println(Arrays.toString(arr));
                                                //OR
        if(k==0){
            System.out.println(Arrays.toString(arr));
            return;
        }else if(k<0){
            k=k+ arr.length;
        }
        Arrays6.reverse(arr,arr.length-k, arr.length-1);
        Arrays6.reverse(arr,0,arr.length-k-1);
        Arrays6.reverse(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
    private static void reverse(int[] arr, int start ,int end) {
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++ ; end-- ;
        }
    }
}
