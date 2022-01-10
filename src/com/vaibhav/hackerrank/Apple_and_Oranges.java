package com.vaibhav.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// https://www.hackerrank.com/challenges/apple-and-orange/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign

public class Apple_and_Oranges {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        List<Integer> apples = new ArrayList<>();
        List<Integer> oranges = new ArrayList<>();
        int m = in.nextInt();
        int n = in.nextInt();
        for(int i=0;i<m;i++){
            apples.add(in.nextInt());
        }
        for(int i=0;i<n;i++){
            oranges.add(in.nextInt());
        }
        countApplesAndOranges(s,t,a,b,apples,oranges);
    }
    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        // Write your code here
        for(int i=0;i<apples.size();i++){
            apples.set(i,apples.get(i)+a);
        }
        // System.out.println(apples);
        for(int i=0;i<oranges.size();i++){
            oranges.set(i,oranges.get(i)+b);
        }
        // System.out.println(oranges);
        int apple = 0;
        for(int i=0;i<apples.size();i++){
            int get = apples.get(i);
            if(get>=s && get<=t){
                apple++;
            }
        }
        int orange = 0;
        for(int i=0;i<oranges.size();i++){
            int get = oranges.get(i);
            if(get>=s && get<=t){
                orange++;
            }
        }
        System.out.println(apple);
        System.out.println(orange);
    }
}
