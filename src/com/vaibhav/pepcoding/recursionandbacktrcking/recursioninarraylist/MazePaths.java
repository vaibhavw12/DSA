package com.vaibhav.pepcoding.recursionandbacktrcking.recursioninarraylist;

import java.util.ArrayList;
import java.util.Scanner;

/*
1. You are given a number n and a number m representing number of rows and columns in a maze.
2. You are standing in the top-left corner and have to reach the bottom-right corner. Only two moves are allowed 'h' (1-step horizontal) and 'v' (1-step vertical).
 */
public class MazePaths {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // by default source (1,1)
        int sourceRow = 1;
        int sourceColumn = 1;
        System.out.println("enter destination row and column :");
        int destinationRow = in.nextInt();
        int destinationColumn = in.nextInt();
        ArrayList<String> arr = getMazePaths(sourceRow,sourceColumn,destinationRow,destinationColumn);
        System.out.println(arr);
        
    }
    // recursive logic  ->> meet expection from all the faiths
    // faith 1 ->> H + getMazePaths(sourceRow,sourceColumn+1,destinationRow,destinationColumn)
    // getMazePaths(sourceRow,sourceColumn+1,destinationRow,destinationColumn) ->> will give me all paths from 1,2 to destination ,so to get all paths from 1,1 to destination just add "H" infront of ,
    // all paths from 1,2 to destination
    // faith 2 ->> V + getMazePaths(sourceRow+1,sourceColumn,destinationRow,destinationColumn)
    // getMazePaths(sourceRow+1,sourceColumn,destinationRow,destinationColumn) ->> will give me all paths from 2,1 to destination ,so to get all paths from 1,1 to destination just add "V" infront of ,
    // all paths from 2,1 to destination
    private static ArrayList<String> getMazePaths(int sourceRow, int sourceColumn, int destinationRow, int destinationColumn) {
        // base case
        if(sourceColumn==destinationColumn && sourceRow==destinationRow){
            ArrayList<String> temp = new ArrayList<>();
            temp.add("");
            return temp;
        }
        // declaring outside if-else block so its scope present outside if-else block also
        ArrayList<String> faith1 = new ArrayList<>();
        ArrayList<String> faith2 = new ArrayList<>();
        if(sourceColumn<=destinationColumn){  // if (sourceColumn == destinationColumn) then horizontal call will be invalid so make only vertical call
          //  ArrayList<String> faith1 = getMazePaths(sourceRow,sourceColumn+1,destinationRow,destinationColumn);
            faith1 = getMazePaths(sourceRow,sourceColumn+1,destinationRow,destinationColumn);  // ->> will give all paths from 1,2 to destination
        }
        if(sourceRow<=destinationRow){       //  if (sourceRow == destinationRow) then vertical call will be invalid so make only horizontal call
          //  ArrayList<String> faith2 = getMazePaths(sourceRow+1,sourceColumn,destinationRow,destinationColumn);
            faith2 = getMazePaths(sourceRow+1,sourceColumn,destinationRow,destinationColumn);  // ->> will give all paths from 2,1 to destination
        }
        ArrayList<String> paths = new ArrayList<>();
        for(String path : faith1){
            paths.add("H "+path);
        }
        for (String path : faith2){
            paths.add("V "+path);
        }
        return paths;
    }
}
