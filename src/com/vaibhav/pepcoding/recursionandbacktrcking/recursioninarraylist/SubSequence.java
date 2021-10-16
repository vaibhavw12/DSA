package com.vaibhav.pepcoding.recursionandbacktrcking.recursioninarraylist;

import java.util.ArrayList;
// for 3 chars in string there are 2**3 subsequence i.e subsets are there
public class SubSequence {
    public static void main(String[] args) {
        String str = new String("abc");
        ArrayList<String> arr = getSubSequene(str);
        System.out.println(arr);
        display(str);  // without using recursion
    }
    // recursive logic
    // expect ->  [---,--c,-b-,-bc,a--,a-c,ab-,abc
    // faith -> [--,-c,b-,bc]
    // meeting exceptation from faith by add adding blank and a infront of every faith subproblem ,
    // here by using loop
    private static ArrayList<String> getSubSequene(String str) {
        if(str.length()==0){
            ArrayList<String> last = new ArrayList<>();
            last.add("");
            return last;    // base case returns "" as empty string has subset itself i.e empty ""
        }
        char ch = str.charAt(0);
        String remining = str.substring(1);
        ArrayList<String> arrRemain = getSubSequene(remining);
        ArrayList<String> result = new ArrayList<>();
        for(String s : arrRemain){
            result.add(""+s);
            result.add(ch+s);
        }
        return result;
    }
    private static void display(String str){
        int l = (int) Math.pow(2,str.length());  // total number of subsequence
        for(int i=0;i<l;i++){
            String s ="";
            int temp = i;
            for(int j=str.length()-1;j>=0;j--){
                int d = temp % 2;
                temp = temp / 2;
                if(d==0){
                    s = "_"+s;
                }else {
                    s = str.charAt(j)+s;
                }
            }
            System.out.println(s);
        }
    }
}
