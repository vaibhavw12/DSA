package com.vaibhav.pepcoding.arrays;

public class FirstOccandLastOcc {
    public static void main(String[] args) {
        int[] arr = {10,10,20,20,30,30,40,50,50,70,80,80,80,80,100};
        int num = 80;
        System.out.println("first occ = "+occ(arr,num,true));
        System.out.println("last occ = "+occ(arr,num,false));
    }

    private static int occ(int[] arr, int num, boolean b) {
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]>num){
                end = mid -1;
            }else if(arr[mid]<num){
                start = mid +1;
            }else{
                if(b){
                    if(mid!=0 && arr[mid-1]==num){
                        end = mid -1;
                    }  else{
                        return mid;
                    }
                }else{
                    if(mid!=arr.length-1 && arr[mid+1]==num){
                        start = mid+1;
                    }else{
                        return mid;
                    }
                }
            }
        }
        return  -1;
    }
}
