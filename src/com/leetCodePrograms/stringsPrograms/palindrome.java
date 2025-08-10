package com.leetCodePrograms.stringsPrograms;
// Approach 1:
public class palindrome {
    public static void main(String[] args) {
        String str = "Madam";
        if(reverse(str)){
            System.out.println(str + " is a Palindrome.");
        }else System.out.println(str + " is  not com.leetCodePrograms.stringsPrograms.palindrome.");
    }

     static boolean reverse(String str) {
        str = str.toLowerCase();
        String rev = "";
        for(int i = str.length() - 1; i >= 0 ; i --){
            rev += str.charAt(i);
        }
        return str.equals(rev);
    }
}
