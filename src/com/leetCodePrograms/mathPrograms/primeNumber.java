package com.leetCodePrograms.mathPrograms;

public class primeNumber {
    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);


        for (int i = 1; i <= 100; i++) {
            //boolean result = isPrime(i);
            if(isPrime(i)) {
                System.out.print( i +" ");
            }
        }
    }
    static boolean isPrime(int n){
        if( n <= 1) return false;
        int c = 2;
        while (c * c <= n){
            if( n % c == 0)
                return false;
            c ++;
        }
      return c * c > n;
    }
}
