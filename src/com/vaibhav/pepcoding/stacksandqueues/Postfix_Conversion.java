package com.vaibhav.pepcoding.stacksandqueues;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class Postfix_Conversion {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();
        Stack<Integer> values = new Stack<>();
        Stack<String> prefix = new Stack<>();
        Stack<String> infix = new Stack<>();
        for(int i=0;i<exp.length();i++){
            char ch = exp.charAt(i);
            if(ch=='+' || ch=='-' || ch=='*' || ch=='/'){
                // for value stack
                int value2 = values.pop();
                int value1 = values.pop();
                int value = Infix_Evaluation.operation(value1,value2,ch);
                values.push(value);
                // for prefix stack
                String pre_value2 = prefix.pop();
                String pre_value1 = prefix.pop();
                String pre_value = ch+pre_value1+pre_value2;
                prefix.push(pre_value);
                // for infix stack
                String in_value2 = infix.pop();
                String in_value1 = infix.pop();
                String in_value = '('+in_value1+ch+in_value2+')';
                infix.push(in_value);
             }else{
                values.push(ch-'0');
                prefix.push(ch+"");
                infix.push(ch+"");
            }
        }
        System.out.println(values.peek());
        System.out.println(infix.peek());
        System.out.println(prefix.peek());
    }
}
