package com.abhiimali;

public class APowB {

    public static void main(String[] args) {
        int base =  3 ;

        int power  = 6 ;

        int ans  = 1 ;

        while(power>0)
        {


            if ((power&1)==1)
            {
                ans = ans * base ;

            }
            base =base*base ;
            power = power >> 1 ;
        }
    }
}
