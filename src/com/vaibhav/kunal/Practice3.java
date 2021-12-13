package com.vaibhav.kunal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// problem 3  ->> WRITTEN NUMBERS

public class Practice3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = 0;
        test = in.nextInt();
        while(test > 0){
            int nn = in.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();

            for(int i=0;i<nn;i++){
                int num = in.nextInt();
                if(num<=0){}
                else{
                    arr.add(num);
                }
            }

            int num = smallestMissingNatNum(arr);
            System.out.println(num+1);
            test--;
        }
    }

    private static int smallestMissingNatNum(ArrayList<Integer> arr) {
        Collections.sort(arr);
//        System.out.println(arr);
        if(arr.get(0)!=1){
            return 0;
        }
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)!=(i+1)){
                return arr.get(i-1);
            }
        }
        int a = arr.get(arr.size() - 1);
        return a;
    }
}
