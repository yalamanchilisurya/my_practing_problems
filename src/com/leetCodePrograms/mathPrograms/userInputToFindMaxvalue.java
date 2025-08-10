package com.leetCodePrograms.mathPrograms;

import java.util.*;


//Take integer inputs till the user enters 0 and print the largest number from all.
public class userInputToFindMaxvalue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();// collection framework
        while(true){
            System.out.print("Enter the  value if it is 0 loop will stop: ");
            int n = input.nextInt();
            if(n == 0) break;
            else
              list.add(n);// adding elements in the array.
        }
        System.out.println(list);
        int max = Collections.max(list);// time Complexity is O(n) : n --> no.of elements in the list.
        System.out.println("Largest value in your entered number :" + max);
    }
}
