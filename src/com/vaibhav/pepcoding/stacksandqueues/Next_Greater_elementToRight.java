package com.vaibhav.pepcoding.stacksandqueues;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

/*
1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing elements of array a.
3. You are required to "next greater element on the right" for all elements of array
4. Input and output is handled for you.

"Next greater element on the right" of an element x is defined as the first element to right of x having value greater than x.
Note -> If an element does not have any element on it's right side greater than it, consider -1 as it's "next greater element on right"
e.g.
for the array [2 5 9 3 1 12 6 8 7]
Next greater for 2 is 5
Next greater for 5 is 9
Next greater for 9 is 12
Next greater for 3 is 12
Next greater for 1 is 12
Next greater for 12 is -1
Next greater for 6 is 8
Next greater for 8 is -1
Next greater for 7 is -1

Constraints

0 <= n < 10^5
-10^9 <= a[i] <= 10^9

Format

Input

Input is managed for you

Output

Output is managed for you

Example

Sample Input

5
5
3
8
-2
7

Sample Output

8
8
-1
7
-1
 */
public class Next_Greater_elementToRight {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = in.nextInt();
        }
        int[] result = next_greaterElementToRight(arr);
        System.out.println(Arrays.toString(result));
    }
    // in O(n) time complexity better approach than brut force
    private static int[] next_greaterElementToRight(int[] arr) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(arr[arr.length-1]);
        int[] result = new int[arr.length];
        result[result.length-1] = -1;
        for(int i= result.length-2;i>=0;i--){
            while(stack.size()!=0 && stack.peek()<=arr[i]){
                stack.pop();
            }if(stack.size()==0){
                stack.push(arr[i]);
                result[i] = -1;
            }else{
                result[i] = stack.peek();
                stack.push(arr[i]);
            }
        }
        return result;
    }
}
