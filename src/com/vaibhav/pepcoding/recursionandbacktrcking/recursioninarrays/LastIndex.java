package com.vaibhav.pepcoding.recursionandbacktrcking.recursioninarrays;

import java.util.Scanner;

public class LastIndex {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {1,22,4,22,3,4,5,5,5,7,4,22,0};
        int lastindex = lastIndex(arr,0,5);
        System.out.println(lastindex);
    }
    // recursive logic
    // f(arr,index,d) = f(arr,index+1,d) -> will return last index from 0 to last-1 + compare with last index and finally return last index
    private static int lastIndex(int[] arr, int index, int d) {
        if(index==arr.length){
            return -1;
        }
        int index1 = lastIndex(arr,index+1,d);
        if(index1==-1){
            if(arr[index]==d){
                return index;
            }else{
                return -1;
            }
        }else {
            return index1;
        }
    }
}
