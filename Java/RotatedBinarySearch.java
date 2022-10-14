package com.abhiimali;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int [] arr = { 5,6,7,1,2,3,4};
        int target = 7 ;
         System.out.println(SearchBinary(arr,target,0,arr.length-1));
    }

     static int SearchBinary(int[] arr, int target, int start , int end) {


         if (start > end)
         {
             return  -1 ;
         }

        int mid = start + (end-start)/2 ;

         if (arr[mid] == target)
         {
             return  mid;
         }

        // CASE 1
        if (arr[start] <= arr[mid] )
        {
            if (target>=arr[start] && target <=arr[mid])
            {

                //  end = mid - 1;
                return  SearchBinary(arr,target,start,mid-1 );

            }
            else
            {
              //  start = mid+1;
                return  SearchBinary(arr,target,mid+1,end );
            }

        }

        else if (target >= arr[mid] && target <= arr[end])
        {

          //  start = mid -1 ;
            return  SearchBinary(arr,target,mid-1,end );
        }

        else
           return  SearchBinary(arr,target,start,mid-1 );


       /// return
    }
}
