package com.abhiimali;

// https://leetcode.com/problems/find-smallest-letter-greater-than-target/submissions/

public class SmallestNumGreaterThanTarget {


    public static void main(String[] args) {

        char letters[] = { 'c', 'f' , 'j'};
        char target  = 'c';
        char result = SearchSmall(letters, target);


        System.out.println(result);

    }

     static char SearchSmall(char[] letters, char target) {
            int n = letters.length ;
         System.out.println(" N Is  :"+n);
//           System.out.println(" Old N :"+letters.length-1);  string  - minus nhi hot bhava
         if (target >= letters[n-1]) return  letters[0];

         int start = 0;
         int end = letters.length-1;
         // System.out.println(end);
         int ans = -1 ;
         while (start<=end) {

             int mid = start + (end - start) / 2;

             if (target < letters[mid]) {
                 end = mid - 1;
                 ans = mid;
             } else {
                 start = mid + 1;
             }

         }
         return  letters[ans] ;
    }

}
