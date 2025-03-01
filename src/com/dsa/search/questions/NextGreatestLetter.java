package com.dsa.search.questions;

public class NextGreatestLetter {

    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target = 'c';
        System.out.println( binarySearch(letters , target));
    }

    static char binarySearch(char[] letters, char target){
        int start = 0;
        int end = letters.length -1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(target > letters[mid]){
                start = mid + 1;
            }
            else {
                end = mid-1;
            }
        }
        return letters[start % letters.length]; // wrap around to start of the array
    }
}
