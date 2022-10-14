package com.abhiimali;

import java.util.Arrays;

public class MultiplyValueBytwoBinarySearch {

    public static void main(String[] args) {
        int [] arr = { 1,4,5,8,6,3,2};

        int original  = 2 ;

        int ans = search(arr,original);
        System.out.println(ans);
    }

    static  int search(int[] arr, int original)
    {
        Arrays.sort(arr);

        int left = 0 ;
        int right = arr.length - 1 ;

        while (left<=right)
        {
            int mid = left + (right-left)/2 ;

            if (arr[mid]==original)
            {
                original = original * 2 ;

            }

            if (original<arr[mid])
            {
                right = mid - 1 ;

            }
            else
            {
                left = mid+1;
            }



        }

        return original ;
    }
}
