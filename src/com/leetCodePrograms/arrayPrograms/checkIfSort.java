package com.leetCodePrograms.arrayPrograms;

public class checkIfSort {
    public static boolean isSort(int[] a){
        for(int i = 1; i <=a.length; i++){
            if (a[i] < a[i -1])
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int [] arr = {10,30,20};
        boolean a = isSort(arr);
        if(a == true)
            System.out.println("yes");
        else
            System.out.println("No");
    }
}
