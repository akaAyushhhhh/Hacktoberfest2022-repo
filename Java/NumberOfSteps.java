package com.abhiimali;

public class NumberOfSteps {

    public static void main(String[] args) {

        int num = 14 ;

         int ans = helper(num,0);
         System.out.println(ans);


    }

     static int helper(int num, int steps ) {

        if (num==0)
        {
            return  steps ;
        }
        // IF NUMBER IS EVEN divide By 2

        if (num%2==0)
        {
           return  helper(num/2,steps+1);

        }
        else
        {
            return  helper(num-1,steps+1);
        }


    }
}
