package com.abhiimali;

import java.util.ArrayList;
import java.util.List;

public class KthClosestElement {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,8,13,16,18};

        int k=4;
        int x = 13 ;
        System.out.println(serachClosest(arr,k,x));
    }


    static List<Integer> serachClosest(int[] arr , int k , int x) {
        // we have to use binary Search


        int low = 0;
        int high = arr.length - k; // Because We want K Elements . Take Care Of Array Boundation

        List<Integer> result = null;
        while (low < high) {
            int mid = low + (high - low) / 2;
//            if (x - arr[mid] > arr[mid + k] - x) {
//                low = mid + 1;
//
//            } else {
//                high = mid;
//            }

            if (x - arr[mid] < arr[mid + k] - x) {
                high = mid;

            } else {

                low = mid+1;

            }

            result = new ArrayList<>();

            for (int i = low; i < low + k; i++) {

                result.add(arr[i]);
            }


        }
        return result;
    }
}
