package com.vaibhav.pepcoding.recursionandbacktrcking.recursion_onthewayup;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintMazePathswith_Jumps {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sourceRow = 1;
        int sourceColumn = 1;
        System.out.println("enter destination row and column :");
        int destinationRow = in.nextInt();
        int destinationColumn = in.nextInt();
        printMazePathswith_Jumps(sourceRow,sourceColumn,destinationRow,destinationColumn,"");
    }

    private static void printMazePathswith_Jumps(int sourceRow, int sourceColumn, int destinationRow, int destinationColumn, String path) {
        if(sourceColumn==destinationColumn && sourceRow==destinationRow){
            System.out.println(path);
            return;
        }
        for(int jump=1;jump<=destinationColumn-sourceColumn;jump++){
            printMazePathswith_Jumps(sourceRow,sourceColumn+jump,destinationRow,destinationColumn,path + "H" + jump);
        }
        for(int jump=1;jump<=destinationRow-sourceRow;jump++){
            printMazePathswith_Jumps(sourceRow+jump,sourceColumn,destinationRow,destinationColumn,path + "V" + jump);
        }
        for(int jump=1;((jump<=destinationColumn-sourceColumn) && (jump<=destinationRow-sourceRow));jump++){
            printMazePathswith_Jumps(sourceRow+jump,sourceColumn+jump,destinationRow,destinationColumn,path + "D" + jump);
        }
    }
}
