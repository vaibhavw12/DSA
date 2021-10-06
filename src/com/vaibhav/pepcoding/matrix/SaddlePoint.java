package com.vaibhav.pepcoding.matrix;

import java.util.Scanner;
// saddle point is a point which is minimum in its row & maximum in its column
public class SaddlePoint {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("enter rows and columns for matrix :");
        int r = in.nextInt();
        int c = in.nextInt();                                                 //  1   2   3   4
        int[][] mat = new int[r][c];                                          //  5   6   7   8     saddle point -> 13
        System.out.println("enter elements row wise :");                      //  9   10  11  12
        matrixMult.createMatrix(mat,r,c);                                     //  13  14  15  16
        findSaddlePoint(mat,r,c);
    }

    private static void findSaddlePoint(int[][] mat, int r, int c) {
        for(int i=0;i<r;i++){            // for each row
            int mincol = mat[i][0];
            int mc = 0;
            for(int j=1;j<c;j++){        // finding minimum in each row as mimcol
                if(mat[i][j] < mincol){
                    mincol = mat[i][j];
                    mc = j;
                }
            }
            boolean b = true;
            for(int k=0;k<r;k++){       // checking mincol is maximum in its row
                if(mat[k][mc]>mincol){
                    b = false;
                    break;
                }
            }
            if(b == true){
                System.out.println(mincol);
                return;
            }
        }
        System.out.println("invalid input");
    }

}
