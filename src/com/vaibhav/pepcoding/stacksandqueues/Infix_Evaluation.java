package com.vaibhav.pepcoding.stacksandqueues;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
/*
1. You are given an infix expression.
2. You are required to evaluate and print it's value.

Constraints

1. Expression is balanced
2. The only operators used are +, -, *, /
3. Opening and closing brackets - () - are used to impact precedence of operations
4. + and - have equal precedence which is less than * and /. * and / also have equal precedence.
5. In two operators of equal precedence give preference to the one on left.
6. All operands are single digit numbers.

Example

Sample Input

2 + 6 * 4 / 8 - 3

Sample Output

2
 */
public class Infix_Evaluation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();
    //  System.out.println(exp);
        Stack<Character> operator = new Stack<>();
        Stack<Integer> operands = new Stack<>();
        for(int i=0;i<exp.length();i++){
            char ch = exp.charAt(i);
            if(ch == '('){
                operator.push(ch);
            }else if(Character.isDigit(ch)){
                operands.push(ch-'0');
            }else if(ch == ')'){
                while(operator.peek()!='('){
                    int value2 = operands.pop();
                    int value1 = operands.pop();
                    char ope = operator.pop();
                    int value = operation(value1,value2,ope);
                    operands.push(value);
                }
                operator.pop();  // extra pop to remove remaining '('
            }else if(ch=='+' || ch=='-' || ch=='*' || ch=='/'){
                // according to these 3 condition
                // precedence will check priority of operator
                // if we encounter '(' then current operator effect is upto that brackets only
                // do this process while stack is not empty
                // ch is wanting higher priority operator to solve first then it will get add to operator
                while(operator.size()>0 && operator.peek()!='(' && precedence(ch)<= precedence(operator.peek())){
                    int value2 = operands.pop();
                    int value1 = operands.pop();
                    char ope = operator.pop();
                    int value = operation(value1,value2,ope);
                    operands.push(value);
                }
                operator.push(ch); // now ch is pushing itself
            }
        }
        while(operator.size()>0){
            int value2 = operands.pop();
            int value1 = operands.pop();
            char ope = operator.pop();
            int value = operation(value1,value2,ope);
            operands.push(value);
        }
        System.out.println(operands.peek());
    }

    public static int precedence(char ope) {
        if(ope=='+'){
            return 1;
        }else if(ope=='-'){
            return 1;
        }else if(ope=='*'){
            return 2;
        }else{
            return 2;
        }
    }

    private static int operation(int value1, int value2, char ope) {
        if(ope=='+'){
            return value1+value2;
        }else if(ope=='-'){
            return value1-value2;
        }else if(ope=='*'){
            return value1*value2;
        }else{
            return value1/value2;
        }
    }
}
