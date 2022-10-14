package com.abhiimali;

class RotateArrayBruteforce {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        System.out.println(rotate(nums,3));
    }

    static int[] rotate(int[] nums, int k) {
        
        while(k-- > 0 )
        {
            int temp=0; 
            int n = nums.length - 1  ;
            temp = nums[n];
            
            for(int i = n ; i > 0 ;  i--)
           {
               nums[i]=nums[i-1];
            }
            
            nums[0]=temp;

            //System.out.println(nums);
        }

        return nums ;

    }
}