package com.vaibhav.pepcoding.stacksandqueues;

import java.util.Scanner;
import java.util.Stack;
/*
1. You are given a string exp representing an expression.
2. You are required to check if the expression is balanced i.e. closing brackets and opening brackets match up well.

e.g.
[(a + b) + {(c + d) * (e / f)}] -> true
[(a + b) + {(c + d) * (e / f)]} -> false
[(a + b) + {(c + d) * (e / f)} -> false
([(a + b) + {(c + d) * (e / f)}] -> false

Constraints

0 <= str.length <= 100

Format

Input

A string str

Output

true or false

Example

Sample Input

[(a + b) + {(c + d) * (e / f)}]

Sample Output

true
 */
public class Balanced_Brackets {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String expression = in.nextLine();
        Stack<Character> stack = new Stack<>();
        // cover all edge test cases
        // 1. for different number of opening and closing brackets (i.e opening > closing or closing > opening)
        // 2. opening == closing but sequence is not matched
        // return false for both cases else return true
        for(int i=0;i<expression.length();i++){
            char ch = expression.charAt(i);
            if(ch=='(' || ch=='[' || ch=='{'){
                stack.push(ch);
            }if(ch==')' || ch==']' || ch=='}' &&  stack.size()!=0){
                if(ch==')'){
                    if(stack.isEmpty()){
                        System.out.println(false);
                        return;
                    }else if(stack.peek()!='('){
                        System.out.println(false);
                        return;
                    }else{
                        stack.pop();
                    }
                }else if(ch==']'){
                    if(stack.isEmpty()){
                        System.out.println(false);
                        return;
                    }else if(stack.peek()!='['){
                        System.out.println(false);
                        return;
                    }else{
                        stack.pop();
                    }
                }else{
                    if(stack.isEmpty()){
                        System.out.println(false);
                        return;
                    }else if(stack.peek()!='{'){
                        System.out.println(false);
                        return;
                    }else{
                        stack.pop();
                    }
                }
            }
        }
        if(stack.isEmpty()){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

    }
}
