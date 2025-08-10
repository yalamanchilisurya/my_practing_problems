package com.leetCodePrograms.arrayPrograms.Searching;

public class findMaxValueIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {5,6,22,2},
                {122,4,2,42},
                {88,78,11}
        };
        int result = maxValue(arr);
        System.out.println(result);
    }
    static int maxValue(int[][] arr){
        int max = arr[0][0];
        for (int[] row : arr) {
            for (int col : row) {
                if (col > max) {
                    max = col;
                }
            }
        }
        return max;
    }
}
