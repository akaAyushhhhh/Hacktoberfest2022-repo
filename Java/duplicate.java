package com.abhiimali;
// https://leetcode.com/problems/find-the-duplicate-number/submissions/
// correct ans
import java.util.Arrays;

public class duplicate {

    public static void main(String[] args) {
         int[] nums  = {1,3,4,3,2};
            int ans = findDuplicate(nums);
        System.out.println(ans);
    }

    static int findDuplicate(int[] nums) {


        int i = 0;
        while (i < nums.length) {

            if (nums[i] != i+1)
            {
                int correct = nums[i] - 1 ;
                if (nums[i] != nums[correct]) {

                    int temp = nums[i];

                    nums[i] = nums[correct];
                    nums[correct] = temp;


                } else {
                    return nums[i];
                }
            }
            else
            {
                i++;
            }


        }

       return -1 ;
    }


}

