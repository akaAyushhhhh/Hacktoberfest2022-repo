package com.abhiimali;

import java.util.Scanner;

public class ChefAddition {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (--t>0)
        {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int  y = sc.nextInt();

            int[] a = new int[n];
            int[] b = new int[n];


            for (int i = 0; i < n ; i++) {

                int temp = sc.nextInt();
                a[i] = temp ;

            }
            for (int j = 0; j < n ; j ++) {

                int temp = sc.nextInt();
                b[j] = temp ;

            }


            int index = 0 ;

            for (int m  = 0; m < n ; m++) {

                if ((b[m]-a[m] != x ) && (b[m]-a[m]) != y )
                {
                    index = 0 ;
                    break;
                }

            }

            if (index == 0)
            {
                System.out.println("NO");
            }
            else
            {
                System.out.println("YES");
            }


        }


    }
}
