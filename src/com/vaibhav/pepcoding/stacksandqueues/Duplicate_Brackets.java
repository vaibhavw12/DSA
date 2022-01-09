package com.vaibhav.pepcoding.stacksandqueues;

import java.util.Scanner;
import java.util.Stack;

/*
1. You are given a string exp representing an expression.
2. Assume that the expression is balanced  i.e. the opening and closing brackets match with each other.
3. But, some of the pair of brackets maybe extra/needless.
4. You are required to print true if you detect extra brackets and false otherwise.

e.g.'
((a + b) + (c + d)) -> false
(a + b) + ((c + d)) -> true

Constraints

0 <= str.length <= 100

Format

Input

A string str

Output

true or false

Example

Sample Input

(a + b) + ((c + d))

Sample Output

true
 */
public class Duplicate_Brackets {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String expression = in.nextLine();
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<expression.length();i++){
            char ch = expression.charAt(i);
            if(ch == ')'){
                if(stack.peek()=='('){
                    System.out.println("True");
                    return;
                }else{
                    while(stack.peek()!='('){
                        stack.pop();
                    }
                    stack.pop();
                }
            }else{
                stack.push(ch);
            }
        }
        System.out.println("False");
    }
}
