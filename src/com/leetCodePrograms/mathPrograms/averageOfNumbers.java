package com.leetCodePrograms.mathPrograms;

import java.util.Scanner;

//Calculate Average Of N Numbers
public class averageOfNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the n value: ");
        int n = input.nextInt();
        double average = 0.0;
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += input.nextInt();

        }
        average = ((double) sum / n);
        System.out.println(average);
    }
}
