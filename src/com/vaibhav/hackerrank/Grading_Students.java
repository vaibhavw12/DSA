package com.vaibhav.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
HackerLand University has the following grading policy:

Every student receives a  in the inclusive range from  to .
Any  less than  is a failing grade.
Sam is a professor at the university and likes to round each student's  according to these rules:

If the difference between the  and the next multiple of  is less than , round  up to the next multiple of .
If the value of  is less than , no rounding occurs as the result will still be a failing grade.

Sample Input 0
4
73
67
38
33
Sample Output 0

75
67
40
33
 */
public class Grading_Students {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        List<Integer> arr = new ArrayList<>();
        for(int i=0;i<size;i++){
            arr.add(in.nextInt());
        }
        List<Integer> result = gradingStudents(arr);
        System.out.println(result);
    }
    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        List<Integer> result = new ArrayList<>();
        for(int i=0;i<grades.size();i++){
            int grade = grades.get(i);
            int time = grade / 5;
            time = (time+1)*5;
            if(grade<=37){
                result.add(grade);
            }else if(grade<=40){
                result.add(40);
            }else if((grade%5) == 0){
                result.add(grade);
            }
            else if((grade+1) == time || (grade+2) == time){
                result.add(time);
            }else{
                result.add(grade);
            }
        }
        return result;
    }

}
