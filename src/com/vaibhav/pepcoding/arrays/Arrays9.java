package com.vaibhav.pepcoding.arrays;

import java.util.Scanner;

//subsets of an Arrays
/*
logic :: for n number of elements there are 2**n subsets as every element has two choice 1 or 0 i.e present or absent
so for every subset i.e i in 2**n try to calculate binary representation of i and from left if its 0->absent ,1->present and
loop till all array element then add it to string to display it finally
 */
public class Arrays9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String num = in.next();
        char[] arr;
        arr = num.toCharArray();
        //for n elements we have 2**n subsets
        printSubSets(arr);
    }

    private static void printSubSets(char[] arr) {
        int l = (int) Math.pow(2, arr.length);
        for(int i=0;i<l;i++){
            int temp = i;
            String s = "";
            for(int j=arr.length-1;j>=0;j--){
                //converting i==temp to binary(0 = empty ,1 = not empty) for every element in arr for every subset(total 2**n)
                int d = temp % 2;
                temp = temp/2;
                if(d==0){
                    s = '-' + s;
                }else{
                    s = arr[j] + s;
                }
                s="\t"+s;
            }
            System.out.println(s);
        }
    }
}
