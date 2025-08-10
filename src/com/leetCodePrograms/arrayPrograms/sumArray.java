package com.leetCodePrograms.arrayPrograms;

import java.util.Arrays;

public class sumArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int n = arr.length;
        int count = 0;
        System.out.println(Arrays.toString(arr));
        for(int i = 1; i < n; i++){
            /* ikkada array lo vunna elements ni add cheyali 1 , 1+2 = 3, 1 + 2 + 3 = 6 ila cheyali
            appudu count variable thisukoni arr[i] lo vunna danto count vunna position element in add cheyalii simple... */
            arr[i] += arr[count];
            count ++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
