package com.leetCodePrograms.mathPrograms;

public class hcfOfaGivenNumber {
    public static void main(String[] args) {
        int a = 12 , b =36;
        int min = Math.min(a,b);
        int count = 0;
        for(int i = 1; i <= min; i++ ){
            if(a % i == 0 && b % i == 0){
                count = i;
            }
        }
        System.out.println(count);
    }
}
