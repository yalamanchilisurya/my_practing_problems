package com.leetCodePrograms.stringsPrograms;

import java.util.Scanner;
// Approach : 2
public class palindromeSecondApproach {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String :");
        String str = input.nextLine();

        if(isPalindrome(str)) System.out.println(str + " is a palindrome");
        else System.out.println(str +"  is not palindrome");
    }

     static boolean isPalindrome(String str) {
        boolean result = true;
         for(int i = 0; i < str.length(); i++){
             if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                 result = false;
                 break;
             }
         }
         return result;
    }

}
