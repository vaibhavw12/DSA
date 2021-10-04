package com.vaibhav.pepcoding.matrix;

import java.util.Arrays;
import java.util.Scanner;

public class matrixMult {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("enter rows and columns for matrix 1 :");
        int r1 = in.nextInt();
        int c1 = in.nextInt();
        int[][] mat1 = new int[r1][c1];
        System.out.println("enter elements row wise :");
        createMatrix(mat1,r1,c1);
        System.out.println("enter rows and columns for matrix 2 :");
        int r2 = in.nextInt();
        int c2 = in.nextInt();
        int[][] mat2 = new int[r2][c2];
        System.out.println("enter elements row wise :");
        createMatrix(mat2,r2,c2);
        if(c1==r2){
            int[][] mat = new int[r1][c2];
            matrixMultiplication(mat1,r1,mat2,c2,mat);
            for(int[] i : mat){
                System.out.println(Arrays.toString(i));
            }                                                                                       //  1   2       1   2         1+6    2+8
        }else{                                                                                      //  3   4       3   4         3+12   6+16
            System.out.println("invalid input");                                                    //  5   6                   5+18   10+24
        }
    }

    private static void matrixMultiplication(int[][] mat1, int r1, int[][] mat2, int c2, int[][] mat) {
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                int ans = 0;
                for(int k=0;k<mat2.length;k++){
                    ans+=mat1[i][k]*mat2[k][j];
                }
                mat[i][j] = ans;
            }
        }
    }

    private static void createMatrix(int[][] mat, int r, int c) {
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat[i][j]=in.nextInt();
            }
        }
    }
}
