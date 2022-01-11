package com.vaibhav.pepcoding.stacksandqueues;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
/*
1. You are given a prefix expression.
2. You are required to evaluate it and print it's value.
3. You are required to convert it to infix and print it.
4. You are required to convert it to postfix and print it.

Note -> Use brackets in infix expression for indicating precedence. Check sample input output for more details.

Constraints

1. Expression is a valid prefix expression
2. The only operators used are +, -, *, /
3. All operands are single digit numbers.

Example

Sample Input

-+2/*6483

Sample Output

2
((2+((6*4)/8))-3)
264*8/+3-
 */
public class Prefix_Conversion {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();
        Stack<Integer> values = new Stack<>();
        Stack<String> postfix = new Stack<>();
        Stack<String> infix = new Stack<>();
        for(int i=exp.length()-1;i>=0;i--){
            char ch = exp.charAt(i);
            if(ch=='+' || ch=='-' || ch=='*' || ch=='/'){
                // for value stack
                int value2 = values.pop();
                int value1 = values.pop();
                int value = Infix_Evaluation.operation(value2,value1,ch);
                values.push(value);
                // for postfix stack
                String pos_value2 = postfix.pop();
                String pos_value1 = postfix.pop();
                String pos_value = pos_value2+pos_value1+ch;
                postfix.push(pos_value);
                // for infix stack
                String in_value2 = infix.pop();
                String in_value1 = infix.pop();
                String in_value = '('+in_value2+ch+in_value1+')';
                infix.push(in_value);
            }else{
                values.push(ch-'0');
                postfix.push(ch+"");
                infix.push(ch+"");
            }
        }
        System.out.println(values.peek());
        System.out.println(infix.peek());
        System.out.println(postfix.peek());
    }
}
