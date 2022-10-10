package com.abhiimali;
// wrong
import java.util.Arrays;

public class ThirdLargestNumber {

    public static void main(String[] args) {
        int arr[] = {2, 2, 3, 1};  // [2,2,3,1]
        int an = Bubble(arr);
        System.out.println(an);
    }

    static int Bubble(int[] arr) {
        boolean swapped = false;
        int count = 0;
        if (arr.length <= 2) {
            //System.out.println(" hey ");
            //return arr[arr.length-1];
        }
        for (int i = 0; i < arr.length; i++) {  //  Outer Loop Is For Passed
            swapped = false;
            // For Each Index , Max Item Will  Come At Last Respective Index
            // outer:
            for (int j = 1; j < arr.length - i; j++) {
                // Swap if J Is Small Than J-1

                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;

                    count++;

                }


            }
            if (swapped == false) {
                    break;
            }
            int n = arr.length - 3;
            int m = arr.length - 2;
            if (count == 3 && n != m) {

                //if (n != m) {
                System.out.println( " 1 ");
                return arr[arr.length - 2];


                // } else {
                //        count = count - 1 ;
                // break outer;
                //}
            } else {
                System.out.println( " here 2 ");
                return arr[arr.length - 4 ];
            }
//            if (swapped == false) {
//
//            }



        }


        return arr[arr.length - 1];
    }
}
