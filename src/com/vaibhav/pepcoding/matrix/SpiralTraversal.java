package com.vaibhav.pepcoding.matrix;

import java.util.Scanner;

public class SpiralTraversal {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("enter rows and columns for matrix :");
        int r = in.nextInt();
        int c = in.nextInt();                                                 //  1   2   3
        int[][] mat = new int[r][c];                                          //  4   5   6   spiral traversal ->  1 4 7 8 9 6 3 2 5
        System.out.println("enter elements row wise :");                      //  7   8   9
        matrixMult.createMatrix(mat, r, c);
        printSpiralTraversal(mat,r,c);
    }

    private static void printSpiralTraversal(int[][] mat, int r, int c) {
        int minr = 0;
        int minc = 0;
        int total = r*c;
        int count = 0;
        r--;c--;
        while(count<total){
            // left column
            for(int i=minr,j=minc; i<=r && count<total ; i++){
                System.out.println(mat[i][j]);
                count++;
            }
            minc++;
            // bottom row
            for(int i=r,j=minc; j<=c && count<total ; j++){
                System.out.println(mat[i][j]);
                count++;
            }
            r--;
            // right column
            for(int i=r,j=c; i>=minr && count<total ; i--){
                System.out.println(mat[i][j]);
                count++;
            }
            c--;
            // top row
            for(int i=minr,j=c; j>=minc && count<total ; j--){
                System.out.println(mat[i][j]);
                count++;
            }
            minr++;
        }
    }
}
