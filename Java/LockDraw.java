package com.abhiimali;

import java.util.Scanner;

public class LockDraw {


    public static void main(String[] args) {
//           int  t = 3 ;
//        for(int i = 0; i < t ; i ++)
//        {
//            for (int j = 0 ; j < t ; j++)
//
//            {
//                if ()
//            }
//        }

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (--t > 0)
        {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            if (A+B==C || A+C==B || B+C==A )
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }

        }




    }


}
