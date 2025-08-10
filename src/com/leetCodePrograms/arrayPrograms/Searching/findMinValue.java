package com.leetCodePrograms.arrayPrograms.Searching;

public class findMinValue {
    public static void main(String[] args) {
        int[] arr = {1,92,21,-1,12,1,-7};
        int result = minValue(arr);
        System.out.println(result);
    }
    static int minValue(int[] arr){
        int min = arr[0];
        for(int n : arr){
            if(n < min) {
                min = n;
            }
        }
        return min;
    }
}
