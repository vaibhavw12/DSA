package com.vaibhav.pepcoding.recursionandbacktrcking.recursioninarrays;

import java.util.ArrayList;
import java.util.Scanner;

public class AllIndices {
    static ArrayList<Integer> arrayList = new ArrayList<>();
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {1,22,4,22,3,4,5,5,5,7,4,22,0};
        allIndices(arr,0,22);
        System.out.println(arrayList);
    }
    // recursive logic
    // simple recursive code for growing stack size + comparing and appending to arrayList
    private static void allIndices(int[] arr, int index, int d) {
        if(index==arr.length){
            return;
        }
        if(arr[index]==d){
            arrayList.add(index);
        }
        allIndices(arr,index+1,d);
    }
}
