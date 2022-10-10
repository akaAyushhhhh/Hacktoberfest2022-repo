package com.abhiimali;
// wrong
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// wrong
public class Sum4 {

    public static void main(String[] args) {
        int arr[] = {1,0,-1,0,-2,2};
        System.out.println(fourSum(arr,0));

    }

    static List<Integer> fourSum(int[] nums, int target) {
            Arrays.sort(nums);
        List<Integer> ans = new ArrayList<>();
            for (int i = 0 ; i < nums.length ; i++)
            {

                for (int j = i+1 ; j < nums.length - 1; j++ )
                {
                    int left = j+1 ;
                    int right = nums.length -1;

                    int temp = nums[i]+nums[j];
                   // System.out.println(ans);
                    if (temp + left + right == target) {
                        ans.add(nums[i]);
                        ans.add(nums[j]);

                        ans.add(nums[left]);
                        ans.add(nums[right]);
                        System.out.println(ans);

                    } else if( temp + left + right < target )
                    {
                        left ++ ;
                    }
                    else
                    {
                        right --  ;
                    }


                }
            }
        System.out.println(ans);
        return ans;
    }
}
