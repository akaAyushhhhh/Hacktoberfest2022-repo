package com.abhiimali;

public class ReverseInt {
    public static void main(String[] args) {

        int x = 123 ;
        System.out.println(reverseInt(x));


    }

     static int reverseInt(int x) {
        int ans = 0 ;
        while (x != 0 )
        {
             int digit = x % 10 ;

             if ( (ans > Integer.MAX_VALUE) || (ans < Integer.MIN_VALUE))
             {
                 return  0 ;
             }

             ans = (ans*10)+digit;

             x=x/10;



        }
        return  ans ;

    }
}
