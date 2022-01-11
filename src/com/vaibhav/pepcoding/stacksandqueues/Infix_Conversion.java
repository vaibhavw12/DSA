package com.vaibhav.pepcoding.stacksandqueues;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
/*
1. You are given an infix expression.
2. You are required to convert it to postfix and print it.
3. You are required to convert it to prefix and print it.

Constraints

1. Expression is balanced
2. The only operators used are +, -, *, /
3. Opening and closing brackets - () - are used to impact precedence of operations
4. + and - have equal precedence which is less than * and /. * and / also have equal precedence.
5. In two operators of equal precedence give preference to the one on left.
6. All operands are single digit numbers.

Example

Sample Input

a*(b-c+d)/e

Sample Output

abc-d+*e/
/*a+-bcde
 */
public class Infix_Conversion {
    // very similar que to Infix_Evaluation
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();
        //  System.out.println(exp);
        Stack<String> postfix = new Stack<>();
        Stack<String> prefix = new Stack<>();
        Stack<Character> operator = new Stack<>();
        for(int i=0;i<exp.length();i++){
            char ch = exp.charAt(i);
            if(ch=='('){
                operator.push(ch);
            }else if(Character.isDigit(ch) || (ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
                postfix.push(ch+"");
                prefix.push(ch+"");
            }else if(ch==')'){
                while(operator.peek()!='('){
                    String value2_pre = prefix.pop();
                    String value1_pre = prefix.pop();
                    String value_pre = operator.peek()+value1_pre+value2_pre;    // format for storing in prefix
                    prefix.push(value_pre);
                    String value2_pos = postfix.pop();
                    String value1_pos = postfix.pop();
                    String value_pos = value1_pos+value2_pos+operator.pop();     // format for storing in postfix
                    postfix.push(value_pos);
                }
                operator.pop();
            }else if(ch=='+' || ch=='-' || ch=='*' || ch=='/'){
                // according to these 3 condition
                // precedence will check priority of operator
                // if we encounter '(' then current operator effect is upto that brackets only
                // do this process while stack is not empty
                // ch is wanting higher priority operator to solve first then it will get add to operator
                while(operator.size()>0 && operator.peek()!='(' && Infix_Evaluation.precedence(ch)<=Infix_Evaluation.precedence(operator.peek())){
                    String value2_pre = prefix.pop();
                    String value1_pre = prefix.pop();
                    String value_pre = operator.peek()+value1_pre+value2_pre;
                    prefix.push(value_pre);
                    String value2_pos = postfix.pop();
                    String value1_pos = postfix.pop();
                    String value_pos = value1_pos+value2_pos+operator.pop();
                    postfix.push(value_pos);
                }
                operator.push(ch);
            }
        }
        while(operator.size()!=0){
            String value2_pre = prefix.pop();
            String value1_pre = prefix.pop();
            String value_pre = operator.peek()+value1_pre+value2_pre;
            prefix.push(value_pre);
            String value2_pos = postfix.pop();
            String value1_pos = postfix.pop();
            String value_pos = value1_pos+value2_pos+operator.pop();
            postfix.push(value_pos);
        }
        System.out.println(prefix.peek());
        System.out.println(postfix.peek());
    }
}
