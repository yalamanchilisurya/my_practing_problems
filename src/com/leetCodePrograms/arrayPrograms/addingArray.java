package com.leetCodePrograms.arrayPrograms;

import java.util.Arrays;

public class addingArray {
    public static void main(String[] args) {
        int[] arr = {1,2,1};
        concat(arr);
    }

    static void concat(int[] arr) {
        int n = arr.length;
        int[] a = new int[2*n];
        // arraycopy ane method use chesi inko array ki copy chestam elemnts.
        System.arraycopy(arr,0,a,0,arr.length);
        System.arraycopy(arr,0,a,n,n);
        System.out.println(Arrays.toString(a));
    }
}
