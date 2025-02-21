package com.dsa.algorithm;

import java.util.Arrays;

public class ReverseIntArray {


    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.stream(arr).toList());
        arr = reverseArray(arr);
        System.out.println(Arrays.stream(arr).toList());

    }

    private static Integer[] reverseArray(Integer[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            swap(arr,start , end);
            start++;
            end--;
        }
        return arr;
    }

    private static Integer[] swap(Integer[] arr , int index1 , int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2]= temp;
        return arr;
    }
}
