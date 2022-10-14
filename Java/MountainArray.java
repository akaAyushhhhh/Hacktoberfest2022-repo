package com.abhiimali;
// https://leetcode.com/problems/peak-index-in-a-mountain-array/

// https://leetcode.com/problems/find-peak-element/submissions/

// same ans for both questions
public class MountainArray {
    public static void main(String[] args) {

    }
    public int peakIndexInMountainArray(int[] arr) {

        int start = 0 ;
        int end = arr.length-1;
        while (start<end)
        {
            int mid = start + (end-start)/2;

            if(arr[mid] > arr[mid+1] ) {
                end = mid;

            }else {
                start = mid+1;
            }

        }
        //System.out.println(" Nothing Found ");
        return start ;
    }
}
