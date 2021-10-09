package com.vaibhav.pepcoding.recursionandbacktrcking.recursionbasic;

import java.util.Scanner;

/*
1. There are 3 towers. Tower 1 has n disks, where n is a positive number. Tower 2 and 3 are empty.
2. The disks are increasingly placed in terms of size such that the smallest disk is on top and largest disk is at bottom.
3. You are required to
    3.1. Print the instructions to move the disks.
    3.2. from tower 1 to tower 2 using tower 3
    3.3. following the rules
        3.3.1 move 1 disk at a time.
        3.3.2 never place a smaller disk under a larger disk.
        3.3.3 you can only move a disk at the top.

 */
public class TowerofHanoi {                                   //             for disk = 3
    public static void main(String[] args) {                  //              1
        Scanner in = new Scanner(System.in);                  //              2                               ->> move all disk to tower 2 using tower 3 by
        int disk = in.nextInt();                              //              3                                   following rules mentioned
        printInstruction(disk,1,2,3);             //            tower 1     tower 2     tower 3
    }
    // recursive logic
    // f(disk,1,2,3) = f(disk-1,1,3,2)+move(remaining disk from 1 to 2)+f(disk-1,3,2,1)
    private static void printInstruction(int disk, int A, int B, int C) {
        if(disk==0){
            return;
        }
        // NOTE : order of A,B&C are varying according to recursive calls and gets printed accordingly
        printInstruction(disk-1,A,C,B);          // left call -> this function will print instructions to move n-1 disk from A to C using B
        System.out.println(disk+" "+A+"->"+B);         // middle part of recursive tree -> will only print instruction to move remaining disk from A to B
        printInstruction(disk-1,C,B,A);          // right call -> this function will print instructions to move n-1 disk from C to B using A
       // ->>> finally all disk will come in tower 2 by following all the rules
    }
}
