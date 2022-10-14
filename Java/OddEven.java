package com.abhiimali;
import java.util.*;
public class OddEven {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);

        System.out.print(" Enter Any Number :");
        int numb =  sc.nextInt();
        if (numb % 2== 0)
        {
            System.out.println(" Numb is even ");
        }
        else {
            System.out.println(" Numb Is ODD ");
        }
    }

}
