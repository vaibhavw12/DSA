package com.vaibhav.pepcoding.arrays;

import java.util.Scanner;

//Diffrence of two Arrays
public class Arrays4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int[] arr1 = new int[num1];
        for(int i=0;i<num1;i++){
            arr1[i]=in.nextInt();
        }
        System.out.println("next ;");
        int num2 = in.nextInt();
        int[] arr2 = new int[num2];
        for(int i=0;i<num2;i++){
            arr2[i]=in.nextInt();
        }
        diffrence(arr1,arr2);
    }

    private static void diffrence(int[] arr1, int[] arr2) {
        int i1 = arr1.length;
        int i2 = arr2.length;
        int[] arr = new int[i2];
        int i3 = i2;
        int c = 0;i1--;i2--;i3--;
        while(i3>=0){
            int d = 0;
            arr2[i2]=arr2[i2]+c;
            if(i1>=0){
                if(arr2[i2]<arr1[i1]){
                    c = -1;
                    d = arr2[i2]+10 - arr1[i1];
                }else{
                    c = 0;
                    d = arr2[i2]-arr1[i1];
                }
                arr[i3]=d;
            } else{
                arr[i3]=arr2[i2];
                c=0;
            }
            i1--;i2--;i3--;
        }
        for(int s : arr){
            System.out.print(s);
        }
    }
}
