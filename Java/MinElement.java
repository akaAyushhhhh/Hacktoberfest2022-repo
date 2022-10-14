package com.abhiimali;

public class MinElement {

    public static void main(String[] args) {

        int[] arr = { 1,2,56,-8,98,4,67};

        System.out.println("Minimum Number :"+ min(arr));
    }

    static  int min(int[] arr) {

        int ans = arr[0];

        for (int i = 1; i <arr.length ; i++){
            if (arr[i] < ans)
            {
                ans = arr[i];
            }


        } return  ans ;

    }
}

// consider first element as min ans then compare with next
// if next i.e current element is less than ans then assign it as ans i.e new min number