package com.patterns;

//        ***** same like right angle triangle but
//        ****
//        ***
//        **
//        *
public class ReverseRightAngle {
    public static void main(String[] args) {
        int n = 5;
        pattern(n);
    }
    static void pattern(int n){
        // outer start n to 1 for print this pattern
        for (int row = n; row >= 1; row --) {
            // inner loop start 1 to i
            for (int col = 1; col <= row; col++) {
                // print the star
                System.out.print("* ");

            }
            // when one row is printed , we need to move nextLine
            System.out.println();

        }
    }
}
