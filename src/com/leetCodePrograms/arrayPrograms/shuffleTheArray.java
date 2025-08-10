package com.leetCodePrograms.arrayPrograms;

import java.util.Arrays;

public class shuffleTheArray {
    public static void main(String[] args) {
        //Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

        //Return the array in the form [x1,y1,x2,y2,...,xn,yn].
        int[] arr = {2, 5, 1, 3, 4, 7};
        int n = 3;
        //[x1,x2,...,xn,y1,y2,...,yn] ila vundhi  kadha ila marchali [x1,y1,x2,y2,...,xn,yn]
        /* ela approach avvali ante vadu n istaduu
         n 3 index dagara vundhi
            Output: [2,3,5,4,1,7]
            2, 5, 1, 3, 4, 7};
            n = 3 --> 3 index lo 3 , 4 , 7 ila consider cheyali

                 n
        2, 5, 1, 3, 4, 7
        x = 2,5,1 y = 3,4,7
        ela place cheyali ante even odd even odd ila arrange cheyalii.
        inko array thisukoni result[2 * n] = arr[i] even position ki
        result[2 * i + 1] = nums[i + n] odd position

         */
        int[] result = new int[2 * n];
        for(int i = 0; i < n; i++){ // n dagaraka for thirigite chalu
            result[2 * i] = arr[i]; // even position
            result[2 * i + 1] = arr[i + n]; // odd position
        }
        System.out.println(Arrays.toString(result));
        //Input =[2, 5, 1, 3, 4, 7]
        // Output: [2,3,5,4,1,7]
    }
}