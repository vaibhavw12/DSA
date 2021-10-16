package com.vaibhav.pepcoding.recursionandbacktrcking.recursioninarraylist;

import java.util.ArrayList;
import java.util.Scanner;

/*
1. You are given a number n representing number of stairs in a staircase.
2. You are standing at the bottom of staircase. You are allowed to climb 1 step, 2 steps or 3 steps in one move.
find total paths you can get to climb the stairs using above conditions
 */
public class StairPaths {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int stairs = in.nextInt();
        ArrayList<String> arr = getStairPaths(stairs);
        System.out.println("different paths possible from "+stairs+" stair to 0 stair is :"+arr.size());
        System.out.println(arr);
    }
    // recursive logic    ->>  meet expection from all the faiths
    // getStairPaths(int stairs-1) ->> will give me all paths from source-1 to destination , so to get all paths from source to destination just add 1 infront of all paths from source-1 to destination
    // getStairPaths(int stairs-2) ->> will give me all paths from source-2 to destination , so to get all paths from source to destination just add 2 infront of all paths from source-2 to destination
    // getStairPaths(int stairs-3) ->> will give me all paths from source-3to destination , so to get all paths from source to destination just add 3 infront of all paths from source-3 to destination
    // finally return all the paths
    private static ArrayList<String> getStairPaths(int stairs) {
        // base cases
        if(stairs==0){   // valid base case
            ArrayList<String> temp = new ArrayList<>();
            temp.add("");
            return temp;
        }if(stairs<0){   // invalid base case
            ArrayList<String> temp = new ArrayList<>();
            return temp;
        }
        ArrayList<String> path1 = getStairPaths(stairs-1);     // faith 1 ->> will give all paths from source-1 to destination
        ArrayList<String> path2 = getStairPaths(stairs-2);     // faith 2 ->> will give all paths from source-2 to destination
        ArrayList<String> path3 = getStairPaths(stairs-3);     // faith 3 ->> will give all paths from source-3 to destination
        ArrayList<String> paths = new ArrayList<>();
        // adding 1,2 & 3 infront of path1,path2 & path3 respectively and store it in List paths and return it
        for(String path : path1){
            paths.add("1"+path);
        }
        for(String path : path2){
            paths.add("2"+path);
        }
        for(String path : path3){
            paths.add("3"+path);
        }
        return paths;
    }
}
