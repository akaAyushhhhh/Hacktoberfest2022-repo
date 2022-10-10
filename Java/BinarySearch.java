package com.abhiimali;
// https://leetcode.com/problems/search-insert-position/


public class BinarySearch {

    public static void main(String[] args) {

        int [] arr = { 1,2,3,4,5,6};
        int target = 8 ;

        int ans = searchB(arr,target);
        System.out.println(" Ans : "+ans);

    }

     static int searchB(int[] arr, int target) {

        int start = 0 ;
        int end = arr.length-1;
        while (start<=end)
        {
            int mid = start + (end-start)/2;

            if(target < arr[mid] )
            {
                end = mid - 1 ;

            }
            if (target > arr[mid])
            {
                start = mid + 1 ;
            }
            if (target == arr[mid])
            {
                return  mid ;
            }

        }
         System.out.println(" Nothing Found ");
        return start ;
    }
}
