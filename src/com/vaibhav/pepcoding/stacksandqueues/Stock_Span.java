package com.vaibhav.pepcoding.stacksandqueues;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

/*
1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing the prices of a share on n days.
3. You are required to find the stock span for n days.
4. Stock span is defined as the number of days passed between the current day and the first day before today when price was higher than today.

e.g.
for the array [2 5 9 3 1 12 6 8 7]
span for 2 is 1
span for 5 is 2
span for 9 is 3
span for 3 is 1
span for 1 is 1
span for 12 is 6
span for 6 is 1
span for 8 is 2
span for 7 is 1

Constraints

0 <= n < 10^5
-10^9 <= a[i] <= 10^9
 */
public class Stock_Span {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = in.nextInt();
        }
        int[] result = stock_span(arr);
        System.out.println(Arrays.toString(result));
    }

    private static int[] stock_span(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[arr.length];
        result[0] = 1;
        stack.push(0);
        for(int i=1;i<arr.length;i++){
            while(stack.size()!=0 && arr[i]>arr[stack.peek()]){
                stack.pop();
            }if(stack.size()==0){
                stack.push(i);
                result[i] = i+1;
            }else {
                result[i] =  i-stack.peek() ;
                stack.push(i);
            }
        }
        return result;
    }
}
