package com.leetCodePrograms.arrayPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class reverseArray {
    public static void main(String[] args) {
       List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);


        List<Integer> result = reverse(arr);
        System.out.println(result);
    }

   static List<Integer> reverse(List<Integer> arr) {
        int n = arr.size();
       System.out.println(arr);
        List<Integer> ls = new ArrayList<>();
        for (int i = n -1 ; i >= 0 ; i --){
            ls.add(arr.get(i));
        }
        return ls;
    }
}
