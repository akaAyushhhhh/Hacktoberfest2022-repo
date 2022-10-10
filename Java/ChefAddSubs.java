package com.abhiimali;/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ChefAddSubs
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (--t>=0)
        {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int  y = sc.nextInt();

            int[] aArray = new int[n];
            int[] bArray = new int[n];


            for (int i = 0; i < n ; i++) {
                
                 aArray[i] = sc.nextInt();
               // Insert Into Arrray 1
                }
                
            for (int j = 0; j < n ; j++) {

                  bArray[j] = sc.nextInt();
               //] = temp ;

            }
            
            
            int index = 1 ;

            for (int m  = 0; m < n ; m++) {
                
                if ((bArray[m]-aArray[m] != x ) && (bArray[m]-aArray[m]) != y )
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
