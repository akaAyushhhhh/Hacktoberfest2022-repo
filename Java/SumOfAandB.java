package com.abhiimali;

public class SumOfAandB {
    public static void main(String[] args) {

        int N = 5 ;
            int count = 0 ;
        for (int i=0;i<N ; i++)
        {
            for (int j = 0 ; j < N ; j++)
            {

                if (i+j == N)
                {
                   /// System.out.println(" Pairs Is : "+i +" And" + j);
                 //   System.out.println(j);\

                    count ++ ;


                }
            }
        }

        System.out.println(count);
    }

}
