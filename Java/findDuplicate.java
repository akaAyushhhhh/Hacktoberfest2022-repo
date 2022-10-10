package com.abhiimali;

import java.util.Arrays;

public class findDuplicate {

    public static void main(String[] args) {
       int[]  numbs = {1,2,3,7,3,5};
        int ans  = findDuplicateNum(numbs);

        System.out.println(ans);
    }


     static  int findDuplicateNum(int[] numbs) {
         Arrays.sort(numbs);
        for ( int i=0; i < numbs.length ; i++)
        {

            if (numbs[i]==numbs[i+1])
            {
                return  numbs[i];
            }
            // return
        }

         return -1;
     }
}

