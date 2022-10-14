//package com.abhiimali;
//// wrong logic
//public class KthDistinctElement {
//    public static void main(String[] args) {
//        String[] arr = {"d","b","c","b","c","a"};
//
//       String ans =  kthDistinct(arr,2);
//        System.out.println(ans);
//    }
//
//
//    static String kthDistinct(String[] arr, int k) {
//             int count = 0;
//             String distinct = "";
//            // int m = 0 ;
//            for (int index = 0 ; index < arr.length / 2; index ++)
//            {
//                for (int j = 1 ; j < arr.length - 1 ; j++)
//                {
//        // !arr[i].equals(arr[j])
//                    if (!arr[index].equals(arr[j])
//                    {
//                       // array[m] = arr[index];
//                       // m++;
//                        distinct = arr[index];
//                        count++;
//                    }
//                }
//                if (count == k)
//                {
//                   return  distinct;
//                }
//
//            }
//
//
//        return distinct;
//    }
//}
