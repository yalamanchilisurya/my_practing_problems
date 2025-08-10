package com.patterns;
//        * * * * *
//        * * * * *
//        * * * * *
//        * * * * *
//        * * * * *
public class squarePattern {
    public static void main(String[] args) {
        int n = 5; // no.of rows and columns
        for (int i = 0 ; i < n; i++){ // this loop for no.of rows
            for (int j = 0; j < n; j++){ // this loop for no.of columns and print *
                System.out.print("* "); // printing *
            }
            System.out.println(); // after finished the j loop curser move next line
        }
    }
}
