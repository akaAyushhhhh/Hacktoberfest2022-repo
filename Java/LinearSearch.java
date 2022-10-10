package com.abhiimali;

public class LinearSearch {

    public static void main(String[] args) {
        int[] arr = {2 , 4, 6, 9, 14 ,67 , 89 , 34 } ;
        int target =  12 ;

        int ans = search(arr,target);
        System.out.println(ans);

    }

    static  int  search(int[] arr , int target )
    {

        if ( arr.length == 0)
        {
            return  -1 ;

        }

        for ( int index = 0 ;  index < arr.length ; index ++)
        {
            int element =  arr[index];
            if (element == target)
            {
                System.out.println(" Element Found At Position "+(index+1));
                return  element  ;
            }

        }
        System.out.println(" Element Not Found ");
        return  -1;

    }
}
