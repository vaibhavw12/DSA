package com.vaibhav.pepcoding.matrix;

import java.util.Scanner;

public class ExitPointofMatrix {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("enter rows and columns for matrix :");
        int r = in.nextInt();
        int c = in.nextInt();                                                 //  0   1   0
        int[][] mat = new int[r][c];                                          //  0   0   0
        System.out.println("enter elements row wise :");                      //  1   1   0
        matrixMult.createMatrix(mat, r, c);
        exitPointofMatrix(mat,r,c);
    }

    private static void exitPointofMatrix(int[][] mat, int r, int c) {
        int count = 0,i = 0,j = 0;
        while(true){
            count =(count+mat[i][j])%4;
            if(count==0){                         // east
                j++;
            }else if(count==1){                   // south
                i++;
            }else if(count==2){                   // west
                j--;
            }else if(count==3){                   // north
                i--;
            }
            // have to find exit position in the matrix
            if(i<0 || j<0 || i==r || j==c){
                if(i<0){
                    i++;
                    System.out.println(i+","+j);
                }else if(j<0){
                    j++;
                    System.out.println(i+","+j);
                }else if(i==r){
                    i--;
                    System.out.println(i+","+j);
                }else{
                    j--;
                    System.out.println(i+","+j);
                }
                break;
            }
        }
    }
}
