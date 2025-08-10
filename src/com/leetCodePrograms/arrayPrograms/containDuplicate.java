package com.leetCodePrograms.arrayPrograms;

import java.util.Arrays;
import java.util.HashSet;

public class containDuplicate {
    public static void main(String[] args) {

        int[] arr = {1,2,2,3,1};
       boolean res = duplicate1(arr);
        System.out.println(res);
        }

     static boolean duplicate(int[] arr) {
         HashSet<Integer> seen = new HashSet<>();
         for(int n : arr){
             if(seen.contains(n)){
                 return true;
             }
             seen.add(n);
    }
    return false;

}
    static boolean duplicate1(int[] arr){
      Arrays.sort(arr);
      for(int i = 1; i < arr.length; i++){
          if(arr[i] == arr[i - 1])
              return true;
      }
return false;
    }
}
