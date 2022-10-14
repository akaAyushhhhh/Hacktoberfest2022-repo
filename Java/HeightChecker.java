package com.abhiimali;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HeightChecker {
    public static void main(String[] args) {
        int[] nums = {1,1,4,2,1,3 };
        int n = heightChecker(nums);
        System.out.println(n);
    }

    static int heightChecker(int[] nums) {


        int i = 0;
        while (i < nums.length) {

            if (nums[i] != i+1)
            {
                int correct = nums[i] - 1 ;
                if (nums[i] != nums[correct]) {

                    int temp = nums[i];

                    nums[i] = nums[correct];
                    nums[correct] = temp;


                }
                //else {
                   // return ;
              //  }
            }
            else
            {
                i++;
            }

        }
        System.out.println(Arrays.toString(nums));

        List<Integer> ans = new ArrayList<>();
        for (int index = 0 ; index < nums.length ; index++)
        {
            if (nums[index] != index)
            {
                ans.add(index);
            }
        }
        System.out.println(ans);
        return ans.size();
    }



}

