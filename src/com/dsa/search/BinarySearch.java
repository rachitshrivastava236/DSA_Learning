package com.dsa.search;

public class BinarySearch {

    public static void main(String[] args) {

        //given a sorted array
        int[] arr = {1,2,3,4,5,6,7,8,9};
        //int[] arr = {90,87,76,65,54,23,22,12,10,8,6,3,2,1};
        int target = 8;
        int ansIndex = 0;
        ansIndex = orderAgnosticBinarySearch(arr , target);
        if(ansIndex != -1){
            System.out.println("Answer Index is "+ansIndex+" and element is " + arr[ansIndex]);
        }else{
            System.out.println("Element not found in the array.");
        }

    }

    private static int orderAgnosticBinarySearch(int[] arr , int target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end-start)/2;
            boolean isAscending = arr[start]<arr[end];

            if(target == arr[mid]){
                return mid;
            }

            if(isAscending){
                if(target < arr[mid]){
                    end = mid-1;
                }
                else {
                    start = mid+1;
                }
            }else{
                if(target > arr[mid]){
                    end = mid-1;
                }
                else {
                    start = mid+1;
                }
            }
        }
        return -1;
    }

}
