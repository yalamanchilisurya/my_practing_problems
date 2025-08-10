package com.leetCodePrograms.arrayPrograms.Searching;

import java.util.Arrays;
import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Size of the array: ");
        int n = input.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i < n; i++){
            System.out.print("Enter the value for index" + i + ": ");
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.print("Enter the target element in the given array: ");
        int target = input.nextInt();

      if(isFound(arr,target)){
          System.out.println("target found ");
      }else System.out.println("target not found .");


    }

   static boolean isFound(int[] arr, int target) {
       for (int element : arr){
        if(element == target){
            return true;
        }
    }
       return false;
    }
}
