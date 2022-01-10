package com.vaibhav.pepcoding.stacksandqueues;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

/*
1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing the height of bars in a bar chart.
3. You are required to find and print the area of largest rectangle in the histogram.

e.g.
for the array [6 2 5 4 5 1 6] -> 12

Constraints

0 <= n < 20
0 <= a[i] <= 10
 */
public class Largest_AreaofHistogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = in.nextInt();
        }
        // for calculation of width for each element in histogram
        int[] left_boundary = left_boundary(arr);
        System.out.println(Arrays.toString(left_boundary));
        int[] right_boundary = right_boindary(arr);
        System.out.println(Arrays.toString(right_boundary));
        // areas will get store for each element according to its width and length
        int[] areas = new int[size];
        for(int i=0;i<size;i++){
            int width = right_boundary[i] - left_boundary[i] -1;
            areas[i] = arr[i] * width;
        }
        System.out.println(Arrays.toString(areas));
        int max = areas[0];
        // calculating max area
        for(int i=1;i<size;i++){
            if(max < areas[i]){
                max = areas[i];
            }
        }
        System.out.println(max);
    }
    // calculating right boundary ->> reverse iteration and eliminate bigger values as we want next smaller value for its right boundary
    private static int[] right_boindary(int[] arr) {
        int[] result = new int[arr.length];
        result[arr.length-1] = arr.length;
        Stack<Integer> stack = new Stack<>();
        stack.push(arr.length-1);
        for(int i=arr.length-2;i>=0;i--){
            while(stack.size()!=0 && arr[i]<=arr[stack.peek()]){
                stack.pop();
            }if(stack.size()==0){
                result[i] = arr.length;
            }else {
                result[i] = stack.peek();
            }
            stack.push(i);
        }
        return result;
    }

    private static int[] left_boundary(int[] arr) {
        int[] result = new int[arr.length];
        result[0] = -1;
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for(int i=1;i< arr.length;i++){
            while(stack.size()!=0 && arr[i]<=arr[stack.peek()]){
                stack.pop();
            }if(stack.size()==0){
                result[i] = -1;
            }else {
                result[i] = stack.peek();
            }
            stack.push(i);
        }
        return result;
    }
}
