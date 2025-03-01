package com.dsa.search.questions;

import java.util.Arrays;

public class FirstAndLastOccuranceOfNumber {

    public static void main(String[] args) {
        int[] arr = {3,7,7,8,8,10};
       //search(arr,7);
        System.out.println(Arrays.toString(searchRange(arr, 7)));
    }

    public int[] searchRange(int[] nums, int target){
        int[] ans = {-1,-1};
        ans[0]= find(nums , target , true);
        ans[1]= find(nums,target,false);
        return ans;
    }

    public static int find(int[] arr , int target , boolean isFirstIndex){
        int ans = -1;
        int start = 0 ;
        int end = arr.length -1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(target < arr[mid]){
                end = mid-1;
            }
            else if (target > arr[mid]){
                start = mid + 1;
            }
            else{
                ans = mid;
                if(isFirstIndex){
                    end = mid -1;
                }else {
                    start = mid+1;
                }
            }
        }
        return ans;
    }
    public static int firstOccurance(int[] arr , int target){
        int start = 0;
        int end = arr.length -1;
        while(start <= end){
            int mid = start + (end-start)/2;

            if(target < arr[mid]){
                end = mid-1;
            }
            else if (target > arr[mid]){
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return start;
    }

    public static int lastOccurance(int[] arr , int target ){
        int start = 0;
        int end = arr.length -1;
        while(start <= end){
            int mid = start + (end-start)/2;

            if(target < arr[mid]){
                end = mid-1;
            }
            else if (target > arr[mid]){
                start = mid+1;
            }
            else {
                start = mid+1;
            }
        }
        return end;
    }

}
