package com.leetCodePrograms.stringsPrograms;

import java.util.HashSet;
// Check if a given string sentence contains every letter from 'a' to 'z' at least once.
public class PangramOrNot {
    public static void main(String[] args) {
     String str = "surya";// take a string

     boolean result = isPangram(str); // store a result of a return the value
        System.out.println(result); // printing

    }

  static boolean isPangram(String str) {
      HashSet<Character> list = new HashSet<>(); // create an object for HashSet class
      for(int i = 0; i < str.length(); i++){ // run a loop for storing the characters in hashset array
          list.add(str.charAt(i)); // The charAt(i) method returns the character at the index position i in the string.
      }
      return list.size() == 26; // if list length equal to 26 it's will return true otherwise false.
    }
}
