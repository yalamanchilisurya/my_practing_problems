package com.patterns;

public class PyramidPattern {
    public static void main(String[] args) {
        int n = 5;
        pattern(n);
        patternReverse(n);

    }

     static void pattern(int n) {
         for(int i = 0; i < n; i ++){
             int space = n - i - 1;
             for(int j = 0; j < n; j++){
                 if(j < space){
                     // just change the space
                     System.out.print(" ");
                 }else System.out.print("* ");
             }
             System.out.println();
         }
         System.out.println();
    }
     static void patternReverse(int n){
         for(int i = n; i > 0; i --){
             int space = n - i - 1;
             for(int j = 0; j < n; j++){
                 if(j > space){
                     System.out.print("* " );
                 }else System.out.print(" ");
             }
             System.out.println();
         }
     }
}
