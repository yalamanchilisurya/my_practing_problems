package com.leetCodePrograms.arrayPrograms.Searching;

public class searchInRange {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int target = 6;
        boolean  result = isFound(arr,target,0,3);
        System.out.println(result);

    }

    static boolean isFound(int[] arr, int target, int s, int e) {
        if(arr.length == 0){
            return false;
        }
        for(int i = s; i <= e; i++){
            if(arr[i] == target){
                return true;
            }
        }
        return false;
    }
}
