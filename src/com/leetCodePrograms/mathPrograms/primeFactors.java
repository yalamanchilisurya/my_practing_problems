package com.leetCodePrograms.mathPrograms;


import java.util.*;

/*  Input a number and print all the factors of that number (use loops).
*     36 prime factors is 1 , 2 , 3 , 4, 6          */
public class primeFactors {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = input.nextInt();
  // time complexity of this loop is O(sqrt(n))
        for(int i = 1; i * i <= n; i ++) {
            if (n % i == 0) {
                list.add(i);
                if ((n / i) != i)
                  list.add(n / i);
            }
        }
        // time complexity of this sorting the array O(n log(n))
//        O(n log n) in the average and worst cases
//
//        O(n) in the best case (when list is already sorted or nearly sorted)
        Collections.sort(list);
        //Printing the list array items
        System.out.print(list);
    }
}
