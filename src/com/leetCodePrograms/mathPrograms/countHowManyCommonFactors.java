package com.leetCodePrograms.mathPrograms;



public class countHowManyCommonFactors {
    public static void main(String[] args) {
        int a = 12, b = 6;
        int result = commonFactor(a,b);
        System.out.println(result);
    }
    static int commonFactor(int a, int b){

        int count = 0;
        int max = Math.max(a,b);

        for(int i = 1; i  <= max; i++){
            if(a % i == 0 && b % i == 0) {
                count++;

            }
        }


        return count;
    }
}
