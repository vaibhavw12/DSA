package com.vaibhav.pepcoding.matrix;

import com.vaibhav.pepcoding.arrays.ArrayRotation;

import java.util.Arrays;
import java.util.Scanner;

public class ShellRotate {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("enter rows and columns for matrix :");
        int r = in.nextInt();                                                 //
        int c = in.nextInt();                                                 //  1   2   3                              2  3  6
        int[][] mat = new int[r][c];                                          //  4   5   6   shell rotate-> if by +1 -> 1  5  9
        System.out.println("enter elements row wise :");                      //  7   8   9                              4  7  8
        matrixMult.createMatrix(mat, r, c);
        System.out.println("enter shell number :");
        int shell = in.nextInt();
        System.out.println("enter number of rotations :");
        int rotate = in.nextInt();
        printRotate(mat,r,c,shell,rotate);
    }

    private static void printRotate(int[][] mat, int r, int c, int shell, int rotate) {
        int[] arr = findShell(mat,r,c,shell);                // fill arr by traversing in shell of mat
      //  System.out.println(Arrays.toString(arr));
        ArrayRotation.rotation(arr,rotate % arr.length);   // rotating array by calling rotation function from ArrayRotation class
        fillShell(mat,r,c,shell,arr);                         // fill in the shell after rotation of arr by given rotate
        for(int[] i : mat){
            System.out.println(Arrays.toString(i));           // displaying matrix
        }
    }

    private static void fillShell(int[][] mat, int r, int c, int shell, int[] arr) {
        int minr = shell - 1;
        int minc = shell - 1;
        int maxr = r-shell;
        int maxc = c-shell;
        int k =0;
        for(int i=minr,j=minc;i<=maxr;i++){
            mat[i][j] = arr[k];
            k++;
        }
        for(int i=maxr,j=minc+1;j<=maxc;j++){
            mat[i][j] = arr[k];
            k++;
        }
        for(int i=maxr-1,j=maxc;i>=minr;i--){
            mat[i][j] = arr[k];
            k++;
        }
        for(int i=minr,j=maxc-1;j>minc;j--){
            mat[i][j] = arr[k];
            k++;
        }
    }

    private static int[] findShell(int[][] mat, int r, int c, int shell) {
        int minr = shell - 1;
        int minc = shell - 1;
        int maxr = r-shell;
        int maxc = c-shell;
        int size =2*((maxr-minr)+(maxc-minc));
        int[] arr = new int[size];
        int k =0;
        for(int i=minr,j=minc;i<=maxr;i++){
            arr[k] = mat[i][j];
            k++;
        }
        for(int i=maxr,j=minc+1;j<=maxc;j++){
            arr[k] = mat[i][j];
            k++;
        }
        for(int i=maxr-1,j=maxc;i>=minr;i--){
            arr[k] = mat[i][j];
            k++;
        }
        for(int i=minr,j=maxc-1;j>minc;j--){
            arr[k] = mat[i][j];
            k++;
        }
        return arr;
    }
}
