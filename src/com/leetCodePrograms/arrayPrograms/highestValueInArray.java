package com.leetCodePrograms.arrayPrograms;

import java.util.Scanner;

public class highestValueInArray {
    public static int findValue(int [] arr){
        int high = arr[0];
        for(int i = 1; i < arr.length; i ++){
            if(arr[i] > high){
                high = arr[i];

            }
        }
        return high;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no.of marks: ");
        int n = sc.nextInt();

        int [] marks = new int[n];

        System.out.print("Enter the Marks:");
        for(int i = 0 ; i < n; i ++){
            marks[i] = sc.nextInt();
        }
      int result =  findValue(marks);
        System.out.println("The Hightest Marks: " +result);
        sc.close();
    }
    
}
