package com.leetCodePrograms.arrayPrograms;

import java.util.ArrayList;

public class kidsWthGreaterCandie {
    public static void main(String[] args) {
        ArrayList<Boolean> list = new ArrayList<>();
        int[] arr = {2,3,5,1,3};
        int extraCand = 3;
        int max = Integer.MIN_VALUE;
        // first loop finding max value in the array
        for(int n : arr){
            if(n > max)
                max = n;
        }
        // second loop calculate the extraCandies to kids
        for (int j : arr) {
            if (j + extraCand >= max) // check arr element and extraCandies  greater than or equal to max element or not
                list.add(true);// if statement  will true, adding true to list
            else
                list.add(false); // otherwise add false to list
        }
        System.out.println(list);

        // time complexity of first loop is O(n)
        // second loop O(n)
        // O(n) + O(n) = O(2n) so
        // the time Complexity is O(n)
    }
}
