package com.patterns;

public class patternFour {
    public static void main(String[] args) {
       int n = 5;
        pattern4(n);

    }
    static void pattern4(int n){
        for (int row = 0; row < 2 * n; row++) {
           int totalColIN  = row > n ? 2 * n - row : row;
            for (int col = 0; col < totalColIN; col++) {
                System.out.print("* ");

            }
            System.out.println();

        }
    }

}
