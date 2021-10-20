package com.vaibhav.pepcoding.recursionandbacktrcking.recursioninarraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class MazePathswith_Jumps {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // by default source (1,1)
        int sourceRow = 1;
        int sourceColumn = 1;
        System.out.println("enter destination row and column :");
        int destinationRow = in.nextInt();
        int destinationColumn = in.nextInt();
        ArrayList<String> arr = getMazePathswith_Jumps(sourceRow,sourceColumn,destinationRow,destinationColumn);
        System.out.println(arr);
    }
    // recursion logic
    // meet expectation using faiths
    // jump = 1 ->> 1jump ,jump = 2 ->> 2jump... from specified source(row,column)
    private static ArrayList<String> getMazePathswith_Jumps(int sourceRow, int sourceColumn, int destinationRow, int destinationColumn) {
        if(sourceColumn==destinationColumn && sourceRow==destinationRow){
            ArrayList<String> temp = new ArrayList<>();
            temp.add("");
            return temp;
        }
        ArrayList<String> paths = new ArrayList<>();
        // horizontal
        for(int jump=1;jump<=destinationColumn-sourceColumn;jump++){
            // horizontalPaths will give me all paths with possible horizontal jumps from source(row,column)
            ArrayList<String> horizontalPaths = getMazePathswith_Jumps(sourceRow,sourceColumn+jump,destinationRow,destinationColumn);
            // adding H + jump infront of all possible paths from source(row,column+jump)
            for(String path : horizontalPaths){
                paths.add("H"+jump+path);
            }
        }
        // vertical
        for(int jump=1;jump<=destinationRow-sourceRow;jump++){
            // verticalPaths will give me all paths with possible vertical jumps from source(row,column)
            ArrayList<String> verticalPaths = getMazePathswith_Jumps(sourceRow+jump,sourceColumn,destinationRow,destinationColumn);
            // adding V + jump infront of all possible paths from source(row+jump,column)
            for(String path : verticalPaths){
                paths.add("V"+jump+path);
            }
        }
        // diagonal
        for(int jump=1;jump<=destinationRow-sourceRow && jump<=destinationColumn-sourceColumn ;jump++){
            // diagonalPaths will give me all paths with possible diagonal jumps from source(row,column)
            ArrayList<String> diagonalPaths = getMazePathswith_Jumps(sourceRow+jump,sourceColumn+jump,destinationRow,destinationColumn);
            // adding D + jump infront of all possible paths from source(row+jump,column+jump)
            for(String path : diagonalPaths){
                paths.add("D"+jump+path);
            }
        }
        return paths;
    }
}
