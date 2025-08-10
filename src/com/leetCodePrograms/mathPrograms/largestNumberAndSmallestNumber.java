package com.leetCodePrograms.mathPrograms;

import java.util.Scanner;

public class largestNumberAndSmallestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the a value: ");
        int a = input.nextInt();
        System.out.print("Enter the b value: ");
        int b = input.nextInt();
        System.out.print("Enter the c value: ");
        int c = input.nextInt();
        largestNumber(a,b,c);
        smallestNumber(a,b,c);

    }

     static void smallestNumber(int a, int b, int c) {
         if(a < b & a < c) System.out.println(a +" is a smallest element.");
         else if(b < c & b < a) System.out.println(b + " is a smallest element.");
         else System.out.println(c + " is a smallest element.");
    }

    static void largestNumber(int a, int b, int c) {
        if(a > b & a > c) System.out.println(a +" is a largest element.");
        else if(b > c & b > a) System.out.println(b + " is a largest element.");
        else System.out.println(c + " is a largest element.");
    }

}
