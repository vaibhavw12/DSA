package com.vaibhav.pepcoding.strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//remove prime numbers from given ArrayList
public class RemovePrimeNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=1;i<=20;i++){
            arr.add(i);
        }
        printAllPrimeNumbers(arr); // non-prime numbers betwn 1-20
    }

    private static void printAllPrimeNumbers(ArrayList<Integer> arr) {
        // start loop from end as we remove element, index will get reassigned so ,
        // to avoid check for missed values start from end
        for(int i=arr.size()-1;i>=0;i--){
            if(prime(arr.get(i))){
                arr.remove(i);
            }
        }
        System.out.println(arr);
    }

    private static boolean prime(Integer integer) {
        for(int i=2;i*i<=integer;i++){
            if(integer%i==0){
                return false;
            }
        }
        return true;
    }
}
