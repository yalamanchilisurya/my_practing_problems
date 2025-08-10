package com.leetCodePrograms.arrayPrograms;

public class ArraysDecrementElments {

    public int[] DecrementArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] -= 1;
        }
        return arr;

    }

    public static void main(String[] args) {
        int [] a = new int[5];
        a = new int[]{5,4,3,2,1};
        ArraysDecrementElments lst = new ArraysDecrementElments();
        int[] result = lst.DecrementArray(a);

        for(int n : result){
            System.out.print(n +" ");
        }
    }
}
