package com.vaibhav.pepcoding.stacksandqueues;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

/*
1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing the elements of array a.
3. You are given a number k, representing the size of window.
4. You are required to find and print the maximum element in every window of size k.

e.g.
for the array [2 9 3 8 1 7 12 6 14 4 32 0 7 19 8 12 6] and k = 4, the answer is [9 9 8 12 12 14 14 32 32 32 32 19 19 19]

Constraints

0 <= n < 100000
-10^9 <= a[i] <= 10^9
0 < k < n
 */
public class Sliding_WindowMaximum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = in.nextInt();
        }
        int window_size = in.nextInt();
        // first finding Next Greater element for every element
        Stack<Integer> stack = new Stack<>();
        int[] next_greaterElement = new int[size];
        next_greaterElement[size-1] = size;
        stack.push(size-1);
        for(int i=size-2;i>=0;i--){
            while(stack.size()!=0 && arr[i]>=arr[stack.peek()]){
                stack.pop();
            }if(stack.size()==0){
                next_greaterElement[i] = size;
            }else {
                next_greaterElement[i] = stack.peek();
            }
            stack.push(i);
        }
        System.out.println(Arrays.toString(next_greaterElement));
        // then chek for each window there exist a maximum element in that window or not
        for(int i=0;i<=size-window_size;i++){
            int j=i;
            while (next_greaterElement[j] < i+window_size){
                j = next_greaterElement[j];
            }
            System.out.println(arr[j]);
        }
    }
}
