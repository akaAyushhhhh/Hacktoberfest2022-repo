package com.abhiimali;
// https://leetcode.com/problems/sqrtx/submissions/
public class SquareRoot {

    public static void main(String[] args) {
        int m  = (int) mySqrt(36);
        System.out.println(" Square Root :" +m);
    }
    static long mySqrt(int x) {
        long start = 0 ; long end = x ; long ans = 0 ;
        while(start<=end)
        {
            long mid = start + (end-start)/2 ;
            if(mid*mid <= x )
            {
                ans = mid ;
                start=mid+1;
            }
            else
            {
                end=mid-1;
            } // simple binary search logic

        }
        return ans ; // in leetcode u cant change int main so need to caste
    }
}
