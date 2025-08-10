package com.leetCodePrograms.arrayPrograms.Searching;

import java.util.Arrays;

public class searchInString {
    public static void main(String[] args) {
        String str = "suryatulasi";
        char target = 't';
        System.out.println(Arrays.toString( str.toCharArray()));
        boolean result = isFound(str,target);
        System.out.println(result);
    }
    static boolean isFound(String str, char target){
        if(str.isEmpty()){
            return false;
        }
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == target){
                return true;
            }
        }
        return false;
    }
}
