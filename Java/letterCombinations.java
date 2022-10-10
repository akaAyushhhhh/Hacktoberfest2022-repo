package com.abhiimali;

import java.util.ArrayList;

public class letterCombinations {

    public static void main(String[] args) {

        String digits = "23";
        ArrayList<String> ans = new ArrayList<>();

        if (digits.equals(""))
        {
            System.out.println(ans);
        }

        String []s={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

        System.out.println(combo("",digits,s));
    }

     static ArrayList<String> combo(String p, String up, String[] s) {

        if (up.isEmpty())
        {
            ArrayList<String> a = new ArrayList<>();
            a.add(p);
            return   a ;
        }

         ArrayList <String> ans =new ArrayList<>();
         int dig=up.charAt(0)-'0';//convert char--->int ('2'--->2)

         String s1=s[dig];
         for(int i=0;i<s1.length();i++){
             char ch=s1.charAt(i);
             ans.addAll(combo(p+ch,up.substring(1),s));
         }
         return ans;
    }
}
