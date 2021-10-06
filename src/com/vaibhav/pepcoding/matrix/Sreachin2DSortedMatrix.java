package com.vaibhav.pepcoding.matrix;

import com.vaibhav.pepcoding.arrays.BinarySearch;

import java.util.Scanner;

public class Sreachin2DSortedMatrix {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("enter rows and columns for matrix :");
        int r = in.nextInt();
        int c = in.nextInt();                                                 //  1   2   3   4
        int[][] mat = new int[r][c];                                          //  5   6   7   8
        System.out.println("enter elements row wise :");                      //  9   10  11  12
        matrixMult.createMatrix(mat,r,c);                                     //  13  14  15  16
        System.out.println("enter number to searched :");
        int num = in.nextInt();
        searchin2DSortedMatrix(mat,r,c,num);
    }

    private static void searchin2DSortedMatrix(int[][] mat, int r, int c, int num) {
        c--;
        for(int i=0;i<r;i++){
            if(mat[i][c]==num){
                System.out.println(i+","+c);
                return;
            }else if(mat[i][c]>num){
                int a =BinarySearch.binary(mat[i],num);
                System.out.println(i+","+a);
                return;
            }else{}
        }
        System.out.println("not found");
    }
}

