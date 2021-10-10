package com.vaibhav.pepcoding.recursionandbacktrcking.recursioninarrays;

import java.util.Scanner;

public class FirstIndex {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {1,22,4,22,3,4,5,5,5,7,4,22,0};
        int firstindex = firstIndex(arr,0,4);
        System.out.println(firstindex);
    }
    // recursive logic
    // f(arr,index,d) = compare 0 index with return value + f(arr,index+1,d) -> will return first index from index+1 to last index
    private static int firstIndex(int[] arr, int index, int d) {
        if(index== arr.length){
            return -1;
        }
        if(arr[index]==d){
            return index;
        }
        return firstIndex(arr,index+1,d);
    }
}
