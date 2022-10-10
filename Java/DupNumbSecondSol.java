package com.abhiimali;
// this is another solution for dup number ;
public class DupNumbSecondSol {

// wrong solution

    public static void main(String[] args) {
        int [] arr = { 1,2,3,4,5,6};
        for ( int index = 0 ; index < arr.length ; index ++)
        {
            int target = arr[index] ;
            int ans = searchB(arr,target);
            System.out.println(" Ans : "+ans);
        }

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
       // return start ; to find expected position return start else
        return  -1;
    }
}



