package com.abhiimali;

public class LinearSearchByRecursion {
    public static void main(String[] args) {
        int []  arr = {1,2,3,8,5,6};

        System.out.println(isFound(arr,9,0));
    }
    static boolean isFound(int[] arr,int target , int i) {
        if (i == arr.length - 1)
        {
            return  false ;
        }
        if (arr[i]==target)
        {
            return  true ;
        }
        else
        {
            return   isFound(arr,target,i+1);
        }

    }
}
