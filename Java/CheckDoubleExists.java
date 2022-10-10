package com.abhiimali;
// error
public class CheckDoubleExists {

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4, 8, 12};

        boolean m = checkIfExist(arr);
        System.out.println(m);
    }

    static boolean checkIfExist(int[] arr) {

        for (int i = 0; i < arr.length - 1 ; i++) {
            for (int j = 0; j < arr.length - 1 ; j++) {

                if (arr[i] == arr[j + 1] * 2) {
                    return true;

//                } else {
//                    return false;
//                }
                }


            }
           // return false;
        }
        return false;
    }
}
