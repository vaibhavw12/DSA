package com.vaibhav.pepcoding.matrix;

import java.util.Scanner;

public class DiagonalTraversal {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("enter rows and columns for matrix :");
        int r = in.nextInt();
        int c = in.nextInt();                                                 //  1   2   3   4
        int[][] mat = new int[r][c];                                          //  5   6   7   8     diagonal traversal ->  1 6 11 16 2 7 12 3 8 4
        System.out.println("enter elements row wise :");                      //  9   10  11  12
        matrixMult.createMatrix(mat,r,c);                                     //  13  14  15  16
        printDiagonalTraversal(mat,r,c);
    }

    private static void printDiagonalTraversal(int[][] mat, int r, int c) {
        for(int k=0;k<r;k++){
            for(int i=0,j=k;i<r-k;i++,j++){
                System.out.println(mat[i][j]);
            }
        }
    }
}
