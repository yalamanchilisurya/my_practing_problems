package com.patterns;

public class patternFive {
    public static void main(String[] args) {
        pattern5(5);
        patternWithreverse(5);
    }
    static  void pattern5(int n){
        for (int i = 0; i < n; i++) {
            // calculate how much space hava in the pattern
            int space = n - i - 1;
            for (int j = 0; j < n; j++) {
                // printing space ,j greater than space
                if(j < space){
                    System.out.print(" "+" ");
                }
                // printing star, when if condition is false
                else System.out.print("* ");
            }
            // when printing the star we need to move nextline.
            System.out.println();
        }
        System.out.println();
    }
    static void patternWithreverse(int n){
        for(int i = 0; i < n; i ++){
            int space = n - i - 1;
            for(int j = 0; j < n; j++){
                if(j > space){
                    System.out.print(" ");
                }else System.out.print("* ");
            }
            System.out.println();
        }
    }
}
