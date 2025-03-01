package com.dsa.search.questions;

public class SearchInInfiniteArray {
    public static void main(String[] args) {
    int[] arr = { 1,2,3,4,5,6,7,8,9,10,11,12,23,45,56,67,78,99,123,234,345,456,567,678,789,888,1342,4652,6722};
        System.out.println(search(arr,10 ));
    }

    public static int search(int[] arr , int target){
       int start = 0;
       int end = start + 1;
       //finding the start and end
       while(target > arr[end]){
           /*int newStart = end + 1 ;
           end = end + (end - start + 1) * 2;
           start = newStart;*/
           start = end+1;
           end = end *2;
       }

       //applying binary search
        while(start <= end ){
            int mid = start + (end - start)/2;
            if(target < arr[mid]){
                end = mid - 1;
            }
            else if (target > arr[mid]){
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
       return -1;
    }
}
