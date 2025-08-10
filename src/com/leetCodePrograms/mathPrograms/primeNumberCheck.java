package com.leetCodePrograms.mathPrograms;

import java.util.Scanner;
// prime is a number extract divisible by factors 1  and itself is called prime number.
public class primeNumberCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = input.nextInt();
        boolean result = isPrime(n);
        System.out.println(result);
    }
    static boolean isPrime(int n){
        int count = 0 ;// take a count for calculate divisible by factor 1 , 2 and itself
        for(int i = 1; i * i <= n; i ++){ // run a loop with checking multiply by 2 for running sqr(n)
            if((n % i) == 0) // check number divisible by i , if it's true count Increment
            {
                count ++;
                if((n / i ) != i) count ++; // this condition for find 2nd factor of the prime number
            }
        }
        return count == 2; // return the value :if it's  true count equal to 2 ,otherwise false return
    }
}
