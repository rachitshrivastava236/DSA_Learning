package com.dsa.search.questions;

public class HighestInMountainArray {
    public static void main(String[] args) {
        int[] arr = {0,2,1,0};
        System.out.println(peakIndexInMountainArray(arr));
    }

    public static int peakIndexInMountainArray(int[] arr){
        int start = 0;
        int end  = arr.length-1;
        int peak = arr[0];
        while(start < end){
            int mid = start + (end - start)/2;
            if(arr[mid+1] > arr[mid]){
                start = mid+1;
            }
            else if( arr[mid+1] < arr[mid]){
                end = mid ;
            }
        }
        return start;
    }

}
