package com.leetCodePrograms.mathPrograms;

import java.util.HashSet;
import java.util.Scanner;
// the Time complexity of O(log n)
public class HappyNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        boolean result = isHappy(n);
        System.out.println(result);
    }
    static boolean isHappy(int n){
        HashSet<Integer> list = new HashSet<>();
        // when loop end if n value is 1 or contain n value in set
        while(n != 1 && !list.contains(n)){
            // adding n value in set
            list.add(n);
            // call the funtion for calculate the square the n
            n = sumOfSquare(n);
        }
        //true if n is 1, else false
        return n == 1;
    }
    static int sumOfSquare(int n){
        int sum = 0;
        while(n > 0){
            int count = n % 10;
            sum += count * count;
            n /= 10;
        }
        return sum;
    }
}
