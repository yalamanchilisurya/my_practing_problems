package com.leetCodePrograms.mathPrograms;

public class countRoundGame {
    public static int maxMoves(int a, int b) {
        int moves = 0;

        // from b+1 to a
        for (int i = b + 1; i <= a; i++) {
            moves += countPrimeFactors(i);
        }

        return moves;
    }

    // Function to count total prime factors of a number
    public static int countPrimeFactors(int n) {
        int count = 0;

        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                count++;
                n /= i;
            }
        }

        if (n > 1) {
            count++; // remaining prime factor > sqrt(n)
        }

        return count;
    }

    public static void main(String[] args) {
        int a = 3, b = 1;
        System.out.println("Maximum possible moves: " + maxMoves(a, b));
    }
}
