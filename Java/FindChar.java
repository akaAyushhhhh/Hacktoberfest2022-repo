package com.abhiimali;

class FindChar {
    public static void main(String[] args) {

        String a = "abcd";
        String b = "abcdk";
        char ans = findTheDifference(a,b);
        System.out.println(ans);
    }


    static char findTheDifference(String s, String t) {
     
        int sumS = 0 ;
        int sumT = 0 ;

        for (char ch: s.toCharArray()) {

            sumS = sumS + (int) ch ;

        }
        for (char cm : t.toCharArray()) {

            sumT = sumT + (int) cm ;

        }

        // Now Calculate Diff

        int ans = sumT - sumS ;

        char temp =  (char)ans ;

    return  temp ;
    }
}