package com.leetCodePrograms.arrayPrograms;

import java.util.*;
//approach this problem hashMap time complexity is O(n log(n))
// approach 2 is using two loops; tc --> O(n^2)
public class howManyNumbersSmallerThan {
    public static void main(String[] args) {


        int[] arr = {8, 1, 2, 2, 3};
        int n = arr.length;
        int[] result = new int[arr.length];
        int[] sorted = arr.clone();
        Arrays.sort(sorted);
        HashMap<Integer, Integer> list = new HashMap<>();//hashMap
        for(int i = 0; i < n; i++){
            if(!list.containsKey(sorted[i])){
                list.put(sorted[i],i );
            }
        }
        for(int i = 0; i < n; i++){
            result[i] = list.get(arr[i]);
        }
        System.out.println(Arrays.toString(result));
    }
}
