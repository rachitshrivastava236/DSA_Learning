package com.dsa.search.questions;

public class FindFloorOfTheNumber {

    public static void main(String[] args) {
        int[] arr = {1,4,6,8,9,12,42,44,46,76,98};
        int target = 45;
        floor(arr , target);
        System.out.println(floor(arr , target));
    }

    private static int floor(int[] arr , int target){
        int start = 0;
        int end = arr.length-1;
        int mid = -1;
        if(target < arr[start]) return -1;
        while(start <= end){
            mid = start + (end-start)/2;
            if(target > arr[mid]){
                start = mid+1;
            }else if (target < arr[mid]){
                end = mid-1;
            }
            else{
                return mid;
            }
        }
        return end ;
    }
}
