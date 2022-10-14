package com.abhiimali;

import java.util.Arrays;

public class MergedSortedArray {

    public static void main(String[] args) {
        int [] arr = { 1,3};
        int [] nums = {6,7,8};
        sort(arr, nums);
        System.out.println(Arrays.toString(arr));
    }

    static  void  sort(int[] arr, int [] nums )
    {


        for (int i = 0 ; i < arr.length - 1 ; i ++)
        {
            for (int j = i+ 1;j>0;j--) {

                if (arr[j] < arr[j - 1]) {//int temp = arr[j];
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
                else
                {
                    break;
                }
            }
        }

    }
}
