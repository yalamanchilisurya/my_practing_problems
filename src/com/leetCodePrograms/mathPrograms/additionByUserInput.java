package com.leetCodePrograms.mathPrograms;

import java.util.Scanner;

//Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
public class additionByUserInput {
    public static void main(String[] args) {
        int sum = 0;
        Scanner input  = new Scanner(System.in);
        while(true){
            System.out.print("Enter the adding number: ");
            int n = input.nextInt();
            if(n == 0) {
                System.out.println("Exited....");
                break;}
            else {
                sum += n;
                System.out.println(sum );
            }
        }
    }
}
