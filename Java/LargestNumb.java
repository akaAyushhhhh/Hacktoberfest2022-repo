package com.abhiimali;
import  java.util.*;
public class LargestNumb {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" Enter Number 1 :");
        int  a =  input.nextInt();

        System.out.println(" Enter Number 2:");
        int  b =  input.nextInt();



        int large = ( a> b ) ? a:b ;
        System.out.println(" Large Numb Is : "+large);

// traditional Logic here
//        if (a > b)
//        {
//            System.out.println(" Large Numb Is : "+a);
//        }
//        else {
//            System.out.println(" Large Numb Is : "+b);
//        }
    }

}





