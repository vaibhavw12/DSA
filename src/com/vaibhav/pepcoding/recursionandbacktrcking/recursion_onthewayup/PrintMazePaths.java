package com.vaibhav.pepcoding.recursionandbacktrcking.recursion_onthewayup;

import java.util.Scanner;

public class PrintMazePaths {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sourceRow = 1;
        int sourceColumn = 1;
        System.out.println("enter destination row and column :");
        int destinationRow = in.nextInt();
        int destinationColumn = in.nextInt();
        printMazePaths(sourceRow,sourceColumn,destinationRow,destinationColumn,"");
    }

    private static void printMazePaths(int sourceRow, int sourceColumn, int destinationRow, int destinationColumn, String path) {

        if(sourceRow == destinationRow && sourceColumn == destinationColumn){
            System.out.println(path);
            return;
        }
//        // smart base case
//        if(sourceRow > destinationRow || sourceColumn > destinationColumn){
//            return;
//        }
//        // normal calls
//        printMazePaths(sourceRow,sourceColumn+1,destinationRow,destinationColumn,path + "H ");
//        printMazePaths(sourceRow+1,sourceColumn,destinationRow,destinationColumn,path + "V ");
//
        // smart calls so need for smart base case to handle
        if(sourceRow <= destinationRow){
            printMazePaths(sourceRow+1,sourceColumn,destinationRow,destinationColumn,path + "V ");
        }
        if(sourceColumn <= destinationColumn){
            printMazePaths(sourceRow,sourceColumn+1,destinationRow,destinationColumn,path + "H ");
        }
    }
}
