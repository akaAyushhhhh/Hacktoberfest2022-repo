package com.abhiimali;
/*


We define the usage of capitals in a word to be right when one of the following cases holds:

All letters in this word are capitals, like "USA".
All letters in this word are not capitals, like "leetcode".
Only the first letter in this word is capital, like "Google".
Given a string word, return true if the usage of capitals in it is right.


 */
public class DetectCapital {

    public static void main(String[] args) {

        String word = "Coding";

        boolean ans  = detectCapitalUse(word);
        System.out.println(ans);

    }

    static  boolean detectCapitalUse(String word) {

          if (word.equals(word.toLowerCase()) || word.equals(word.toUpperCase())) {
              return  true ;
          }

          if ( (int) word.charAt(0) < 91 )
          {
              for ( int i = 1 ; i < word.length() ; i++)
              {
                  if (word.charAt(i) < 91)
                  {
                      return  false ;
                  }

              }
              return  true ;


          }

        return  false ;

    }


}
