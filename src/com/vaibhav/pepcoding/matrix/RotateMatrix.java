package com.vaibhav.pepcoding.matrix;

import java.util.Arrays;
import java.util.Scanner;
// rotate matrix by 90 degree clockwise
// NOTE : no extra space to be used so row and column must be entered same
public class RotateMatrix {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("enter rows and columns for matrix :");
        int r = in.nextInt();                                                 //                      rotate by 90 degree clockwise
        int c = in.nextInt();                                                 //  1   2   3                1  4  7                      7  4  1
        int[][] mat = new int[r][c];                                          //  4   5   6   transpose->  2  5  8  reverse each row->  8  5  2
        System.out.println("enter elements row wise :");                      //  7   8   9                3  6  9                      9  6  3
        matrixMult.createMatrix(mat, r, c);
        printRotate(mat,r,c);
    }

    private static void printRotate(int[][] mat, int r, int c) {
        // transpose of mat store in mat itself
        for(int i=0;i<r;i++){
            for(int j=i;j<c;j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        // reverse each row
        for(int i=0;i<r;i++){
            int start = 0;
            int end = c-1;
            while(start<end){
                int temp = mat[i][start];
                mat[i][start] = mat[i][end];
                mat[i][end] =temp;
                start++;end--;
            }
        }
        // printing mat
        for(int[] i : mat){
            System.out.println(Arrays.toString(i));
        }
    }
}
