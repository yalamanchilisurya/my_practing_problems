package com.leetCodePrograms.mathPrograms;

import java.util.Scanner;

public class factorialProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = input.nextInt(); // user integer input
        int fact = 1; // take a variable for storing multiplying numbers.
        for (int i = 1; i <= n; i++){ // loop will start with 1 because if we put 0 fact became a 0, so must start with 1
            fact *= i; // calculating the product at range (1 to n)
        }
        System.out.println(n + " factorial is a "+ fact);// final print the result.
    }
}
