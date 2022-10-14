package com.abhiimali;
/*

iven an array of integers arr, return true if and only if it is a valid mountain array.

Recall that arr is a mountain array if and only if:

arr.length >= 3
There exists some i with 0 < i < arr.length - 1 such that:
arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
arr[i] > arr[i + 1] > ... > arr[arr.length - 1]

 */
public class ValidMoutainArray {

    public static void main(String[] args) {

        int[] word = { 2,3,4,5 };

        boolean ans  = validMountainArray(word);
        System.out.println(ans);
    }

    static boolean validMountainArray(int[] arr) {

            if (arr.length < 3)
            {
                return  false ;
            }

            int  i ;
            // following code will find out peak element

            for ( i =0 ; i < arr.length -1  ; i++)
            {

                if (arr[i] < arr[i+1])  continue ;
                else   break;

            }
            // following condition will look for i or peak should not be first or last element if it is then it is not
        // mountain array  ... it will be ONLY increasing or ONLY decreasing  array
            if (i==0 || i == arr.length -1 ) return  false ;

            /// traverse array from back to check whether the array is Decreasing

            for (int j = arr.length - 1 ; j > i ; j -- )
            {
                if (arr[j] < arr[j-1]) continue;
                else
                    return  false ;
            }

            return  true;

          // end statement
    }
}
