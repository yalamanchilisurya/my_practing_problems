package com.leetCodePrograms.arrayPrograms;

import java.util.ArrayList;
import java.util.Arrays;

public class Demo {
    public static void DivisionByFour(ArrayList<Integer> arr){
for(int i = 0 ; i < arr.size(); i ++){
    if(arr.get(i) % 4 == 0){
        arr.set(i, arr.get(i) / 4);
    }else if (arr.get(i) / 4 == 0)
        arr.set(i,arr.get(i)/4);
    else
        arr.set(i,0);

}
for(int i = 0 ; i < arr.size(); i ++){
    if(arr.get(i) == 0)
        arr.set(i , -1);

}


    }
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(44,59,65,66,44,77,88));
        DivisionByFour(arr);

        System.out.println(arr);

    }
}
