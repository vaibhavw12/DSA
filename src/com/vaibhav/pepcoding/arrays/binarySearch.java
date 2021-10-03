package com.vaibhav.pepcoding.arrays;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,546};
        int num = 5;
        System.out.println(binary(arr,num));
    }

    public static int binary(int[] arr,int num) {
        int start = 0 , mid = 0;
        int end = arr.length-1;
        while(start<=end){
             mid = start + (end-start)/2;
            if(arr[mid]==num){
                return mid;
            }else if(arr[mid] > num){
                end = mid -1;
            }else if(arr[mid] < num){
                start = mid +1 ;
            }
        }
        return -1;
    }
}
