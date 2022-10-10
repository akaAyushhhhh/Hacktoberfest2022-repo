package com.abhiimali;

import java.util.ArrayList;
import java.util.List;

public class NumberDisappearedInArray {

    public  List<Integer> missingNumber(int[] nums) {

        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1 ;
            if ( nums[i] != nums[correct]) {
                // swap(nums, i, correct);

                int temp = nums[i];

                nums[i] = nums[correct];
                nums[correct] = temp;


            } else {
                i++;
            }

        }
        /// search for element case 1 N CASE 2
        List<Integer> ans = new ArrayList<>();
        for (int index = 0 ; index < nums.length ; index++)
        {
            if (nums[index] != index + 1 )
            {
                ans.add(index + 1);
            }
        }

        return  ans ;
    }

}
