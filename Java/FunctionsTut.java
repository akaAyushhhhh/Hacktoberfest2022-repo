package com.abhiimali;

import java.util.*;

public class FunctionsTut {
    public static void main(String[] args) {

        sum();

    }
    public static void sum(){
        Scanner input = new Scanner(System.in);

        System.out.println(" Enter Number 1 :");
        int  a =  input.nextInt();

        System.out.println(" Enter Number 2:");
        int  b =  input.nextInt();

        int c = a+b;
        System.out.println(" Sum Is : "+c);

    }
}

