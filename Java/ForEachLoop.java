package com.abhiimali;

public class ForEachLoop {

    public static void main(String[] args) {

        int[] arr = { 1,2,3,4,5,6,7} ;

        for (int num :arr) {

            System.out.println(num);
        }
        // It is for array iteration


        System.out.println(" Same Results In traditional Wayy ");
        for (int i = 0 ; i <arr.length ; i++){
            System.out.println(arr[i]);
        }

    }
}
