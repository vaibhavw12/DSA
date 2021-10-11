package com.vaibhav.pepcoding.recursionandbacktrcking.recursioninarraylist;

import java.util.ArrayList;
// for 3 chars in string there are 2**3 subsequence i.e subsets are there
public class SubSequence {
    public static void main(String[] args) {
        String str = new String("abc");
        ArrayList<String> arr = getSubSequene(str);
        System.out.println(arr);
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
}
