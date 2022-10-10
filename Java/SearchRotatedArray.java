package com.abhiimali;

public class SearchRotatedArray {

    public static void main(String[] args) {

        int []  numbs = { 1,2,3,4,5,3,2,1,0};
        int target = 5;
        int ans = search(numbs,target);
    }

    static int search(int[] numbs, int target)
    {
        int start = 0 ; int end= numbs.length -1 ;
        while (start<=end)
        {
            int mid = start + (end-start)/2;

            if (numbs[mid]==target) return  mid ;
            if (numbs[start] <= numbs[mid])
            {
                if (target>=numbs[start] && target <= numbs[mid])
                {
                    end = mid -1 ;
                }
                else {
                    start = mid+1;

                }
            }
            else {

                if (target>=numbs[mid] && target <=numbs[end])
                {
                    start = mid + 1;
                }
                else
                {
                    end = mid -1 ;
                }


            }
        }
        return  -1;
    }
}
