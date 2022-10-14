package com.abhiimali;


// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/


import javax.swing.plaf.IconUIResource;

public class EvenDigits {

    public static void main(String[] args) {

        int[] nums = {18,124,9,764,98,17} ;

       int ans =  findNumbers(nums);
        System.out.println(ans);
    }

    static int findNumbers(int[] nums) {
        int count = 0 ;

        for (int num : nums){
            if (even(num))
            {
                count ++;
            }

        }

        return count ;

    }

     static boolean even(int num) {

       int a =   digitInNum(num) ;
       return  a%2 == 0;

    }

    static  int digitInNum(int num) {
        int count = 0 ;
        while (num > 0)
        {
            num = num / 10 ;
            count ++ ;
        }
        return  count ;
    }
}
