package com.leetCodePrograms.arrayPrograms;

public class ArraysExamples {
    public static void main(String[] args) {
        int [] a = new int[5];
        a = new int[]{1, 2};
        int n = a.length;
        int sum = 0;
        for (int j : a) {
            sum += j;
        }
        System.out.println(sum);
    }
}
