package com.vaibhav.pepcoding.arrays;

public class CeilandFloor {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80,90,100};
        int num = 1;
        binary(arr,num);
    }

    private static void binary(int[] arr, int num) {
        int start = 0,floor =0,ceil =0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==num){
                System.out.println(mid);
                return;
            }else if(arr[mid]>num){
                end = mid -1;
                ceil = arr[mid];
            }else{
                start = mid +1;
                floor = arr[mid];
            }
        }
        System.out.println("floor = "+floor+" , ceil = "+ceil);
    }
}
