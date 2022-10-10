package com.abhiimali;

// https://leetcode.com/problems/contains-duplicate/

// time error
public class ContainsDuplicate {


    public static void main(String[] args) {

        int[] arr = {1,9,2,0,4,5};

       boolean a =  containsDuplicate(arr);
        System.out.println(a);
    }

    static boolean containsDuplicate(int[] arr) {


       /// boolean swapped = false;
        for (int i = 0; i < arr.length; i++) {  //  Outer Loop Is For Passed
           // swapped = false;
            // For Each Index , Max Item Will  Come At Last Respective Index

            for (int j = 1; j < arr.length - i ; j++) {
                // Swap if J Is Small Than J-1

                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                   // swapped = true;
                }


            }
        }
        for ( int index=1; index < arr.length  ; index++)
        {
            if (arr[index]==arr[index-1])
            {
                return  true ;
            }
        }
        return  false ;
    }

}
