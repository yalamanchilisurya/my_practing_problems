package com.patterns;

import java.util.Scanner;
//        * _ _ _ _  i is increasing next step
//        * * _ _ _
//        * * * _ _
//        * * * * _
//        * * * * *
public class rightAngleTriangle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        rightAngle(n);
        patternWithNumbers(n);
        patternWithNumber(n);
    }
static void rightAngle(int n){
    //  loop for no.of rows .........
    for(int i = 0; i < n; i ++){
        // loop for column and condition is 'i' is increasing every next step so j <= i
        for(int j = 0; j <= i; j++){
            // printing star...
            System.out.print("* ");
        }
        // after, end the 'j' loop  move curser next line.
        System.out.println();
    }
}


//            1
//            1 2
//            1 2 3
//            1 2 3 4
//            1 2 3 4 5

static void patternWithNumbers(int n){
    // outer loop start 1 to n
    for (int row = 1; row <= n; row ++){
        // inner loop start 1 to row
        for(int col = 1; col <=row; col ++){
            // printing col number not star
            System.out.print(col+" ");
        }
        // when one row printing we need to move nextline.
        System.out.println();
    }
}
static void patternWithNumber(int n){
    for (int row = 1; row <= n; row++) {
        for (int col = 1; col <= row; col++) {
            System.out.print(col +" ");

        }
        System.out.println();

    }
}
}
