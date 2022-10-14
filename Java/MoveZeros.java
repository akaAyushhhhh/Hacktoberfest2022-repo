package com.abhiimali;
// https://leetcode.com/problems/move-zeroes/submissions/
import java.util.Arrays;

public class MoveZeros {

    public static void main(String[] args) {
            int[] arr = { 1,3,0,5,4,0,8};
        moveZeroes(arr);
    }

    static void moveZeroes(int[] arr) {
        //boolean swapped = false;
        for (int i = 0; i < arr.length; i++) {  //  Outer Loop Is For Passed
            //swapped = false;
            // For Each Index , Max Item Will  Come At Last Respective Index

            for (int j = 1; j < arr.length - i ; j++) {
                // Swap if J Is Small Than J-1

                if (arr[j-1] == 0 ) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    //swapped = true;
                }


            }
//            if (!swapped) {
//                break;
//
//            }

        }
        //System.out.println(" final :"+Arrays.toString(arr));

    }
}
