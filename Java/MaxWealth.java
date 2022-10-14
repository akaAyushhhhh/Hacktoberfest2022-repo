package com.abhiimali;
// https://leetcode.com/problems/richest-customer-wealth/
public class MaxWealth {

    public static void main(String[] args) {

        int[][]  accounts = {
            {1,12,3} ,
            {3,22,1}
        } ;

        System.out.println(" Waethy : "+wealth(accounts));

    }

     static int wealth(int[][] accounts) {
         int  wealth = Integer.MIN_VALUE;


         for( int i=0; i < accounts.length ; i++)
         {
             int sum = 0 ;

             for (int j=0;j < accounts[i].length ;j++){

                 sum += accounts[i][j];
             }
             //check for overall ans
             if (sum > wealth )
             {
                 wealth = sum ;
             }

         }
         return  wealth ;
    }
}
