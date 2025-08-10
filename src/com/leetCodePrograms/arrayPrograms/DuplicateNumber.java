package com.leetCodePrograms.arrayPrograms;

public class DuplicateNumber {
    public static void main(String[] args) {
        int [] arr = {3,1,3,4,2};
        System.out.println(isDuplicate(arr));
    }

    static int isDuplicate(int[] arr){
        for (int k : arr) {
            for (int j = 1; j <= arr.length; j++) {

                if (k == arr[j]) {
                    return arr[j];
                }
            }
        }
        return 0;
    }

}

