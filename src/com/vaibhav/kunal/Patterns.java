package com.vaibhav.kunal;

import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        pattern1(n);
        pattern2(n);
        pattern3(n);
        pattern4(n);
    }

    private static void pattern1(int n) {
        int j=1;
        for(int i=1;i<=n;i++){
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(i+" ");
            }
            System.out.println("");
        }
        for(int i=n-1;i>0;i--){
            for(j=i;j<n;j++){
                System.out.print(" ");
            }
            for(int k=0;k<i;k++){
                System.out.print(i+" ");
            }
            System.out.println("");
        }
    }

    private static void pattern2(int n) {
        int j =1 , temp = n*n , num = n ,count = n;;
        for(int i=n;i>=1;i--){
            for(j=1;j<=temp;j++){
                System.out.print(num+" ");
                if((j-count)%count==0){
                    num--;
                }
            }
            System.out.println("");
            temp-=n;num=n;count--;
        }
    }

    private static void pattern3(int n) {
        int j=1;
        for(int i=1;i<=n;i++){
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(k*k+" ");
            }
            System.out.println("");
        }
    }

    private static void pattern4(int n) {
        int j=1;
        for(int i=1;i<=n;i++){
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print((k*2)-1+" ");
            }
            System.out.println("");
        }
    }
}
