package com.vaibhav.kunal;

import java.util.Scanner;
// problem 3  ->> CHEF NEEDS HELP
public class Practice2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            String given = new String();
            StringBuilder sb = new StringBuilder();
            given = in.nextLine();
        //    System.out.println(given);
            for(int i=given.length()-1;i>=0;i--){
                if(given.charAt(i)==' '){
                    break;
                }else {
                    sb.append(given.charAt(i));
                }
            }
            sb.reverse();
            System.out.println(sb);

    }
}
