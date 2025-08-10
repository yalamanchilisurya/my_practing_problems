package com.leetCodePrograms.arrayPrograms.Searching;

import java.util.Arrays;

public class search2Darray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {5,6,22,2233},
                {122,4,2,4213},
                {88,78,11}
        };
        int target = 8;
       int[] result = isFound(arr,target);
        System.out.println(Arrays.toString(result));
    }

  static int[] isFound(int[][] arr, int target) {
        for(int i = 0; i < arr.length; i++){
            for(int j = 0 ; j < arr[i].length; j++){
                if(arr[i][j] == target ){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
