package com.abhiimali;
/// https://leetcode.com/problems/missing-number/
public class MissingNumber {
    public static void main(String[] args) {

        int[] nums = {4,2,1,0};
        int ans  = missingNumber(nums);
        System.out.println(ans);
    }
    public static int missingNumber(int[] nums) {

        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] ;
            if ( nums[i] < nums.length && nums[i] != nums[correct]) {

                int temp = nums[i];

                nums[i] = nums[correct];
                nums[correct] = temp;


            } else {
                i++;
            }

        }
        /// search for element case 1 N CASE 2

        for (int index = 0 ; index < nums.length ; index++)
        {
            if (nums[index] != index)
            {
                    return  index ;
            }
        }

        return  nums.length ;
    }

}
