package com.leetCodePrograms.mathPrograms;

public class subtractProductAndSum {
        /*

        Given an integer number n, return the difference between the product of its digits and the sum of its digits.


        Example 1:

        Input: n = 234
        Output: 15
        Explanation:
        Product of digits = 2 * 3 * 4 = 24
        Sum of digits = 2 + 3 + 4 = 9
        Result = 24 - 9 = 15
        */
        public static void main(String[] args) {


            int n = 234;
            int sum = 0 , product = 1;// product assigned 0 is must
            while(n > 0){ // run until n become to 0
                sum += n % 10; //calculate the sum of the  values
                product *= n % 10;// calculate the product of the value
                n /= 10; // removing last value of a n
            }
            int result = product - sum; // final store of a ( product - sum )
            System.out.println(result); // printing result value
        }


}
