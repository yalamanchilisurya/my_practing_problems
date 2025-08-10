package com.leetCodePrograms.arrayPrograms;

public class MaxExampleInArray {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5};
        int max = a[1], n = a.length;
        for(int i = 1; i < n - 1; i++ ){
            if(a[i] < a[i + 1])
                max = a[i];
        }
        System.out.println(max);
    }
}
