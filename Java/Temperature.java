package com.abhiimali;
import  java.util.*;
public class Temperature {

    public static void main(String[] args) {

        System.out.println(" Enter Temp in C :");

        Scanner input = new Scanner(System.in);
        float c =  input.nextFloat();
    // (0°C × 9/5) + 32 = 32°F
        float f = (c * 9/5) + 32 ;
        System.out.println(" F Is : "+f);

    }
}


