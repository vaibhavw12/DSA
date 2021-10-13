package com.vaibhav.pepcoding.recursionandbacktrcking.recursioninarraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class KeypadCombination {
    static String[] given = {".," ,"abc" ,"def" ,"ghi" ,"jkl" ,"mno" ,"pqrs" ,"tu" ,"vwx" ,"yz"};
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the numbers for all different combinations :");
        String str = in.next();
        ArrayList<String> arr =getKeypadCombination(str);
        System.out.print("different combinations possible of "+str+" keypads are :");
        System.out.println(arr.size());
        System.out.println(arr);
    }
    // recursive logic
    // expection str will give all combinations  -> getKeypadCombination(String str)
    // faith excluding str(0) remaining will give us all combination  -> getKeypadCombination(remaining)
    // meet expection by faith by -> in str(0) containing char of string i.e for every char ch + for every return string from faith combination arr ,
    // create new combination i.e ch(every char in string(0)) + s(for every string in faith)
    private static ArrayList<String> getKeypadCombination(String str) {
        if(str.length()==0){
            ArrayList<String> ren = new ArrayList<>();
            ren.add("");
            return ren;
        }
        char ch = str.charAt(0);  // 5
        String remaining = str.substring(1);   // 67
        ArrayList<String> rem = getKeypadCombination(remaining);   // 76 ke combination lekar aayega
        ArrayList<String> res = new ArrayList<>();
        String str_at_ch = given[ch-'0'];
        for(int i=0;i<str_at_ch.length();i++){
            for(String s : rem){
                res.add(str_at_ch.charAt(i)+s);
            }
        }
        return res;
    }
}
