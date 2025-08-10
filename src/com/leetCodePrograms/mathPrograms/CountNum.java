package com.leetCodePrograms.mathPrograms;

public class CountNum {
    public static void main(String[] args) {
        int num = 13344;
        int counter = 0;
        while(num > 0) {
            int rem = num % 10;
            if (rem == 3) counter += 1;
            num /= 10;
        }
        try {
            System.out.println(counter);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
