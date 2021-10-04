package com.vaibhav.pepcoding.matrix;

import java.util.Scanner;

public class WaveTraversal {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("enter rows and columns for matrix :");
        int r = in.nextInt();
        int c = in.nextInt();                                                 //  1   2    wave traversal ->  1 3 4 2
        int[][] mat = new int[r][c];                                          //  3   4
        System.out.println("enter elements row wise :");
        matrixMult.createMatrix(mat,r,c);
        printWaveTraversal(mat,r,c);
    }

    private static void printWaveTraversal(int[][] mat, int r, int c) {
        for(int j=0;j<c;j++){
            if(j % 2 == 0){
                for(int i=0;i<r;i++)
                    System.out.println(mat[i][j]);
            }else{
                for(int i=r-1;i>=0;i--)
                    System.out.println(mat[i][j]);
            }
        }
    }
}
