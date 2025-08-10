package com.leetCodePrograms.stringsPrograms;

public class Shuffle {
    public static void main(String[] args) {
        String str = "codeleet";
        int[] indices = {4,5,6,7,0,1,2,3};
        String result = isShuffle(str,indices);
        System.out.println(result);
    }

     static String isShuffle(String str, int[] indices) {
        char[] result = new char[str.length()];
        for(int i = 0; i < indices.length; i++){
            result[indices[i]] = str.charAt(i);

        }
        return new String(result);
    }
}
