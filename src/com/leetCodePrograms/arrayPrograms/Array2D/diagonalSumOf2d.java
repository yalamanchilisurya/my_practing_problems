package com.leetCodePrograms.arrayPrograms.Array2D;

public class diagonalSumOf2d {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9},

        };
        System.out.println(diagramSum(arr));

    }
    //Add the primary diagonal elements: mat[i][i]
    //Add the secondary diagonal elements: mat[i][n-1-i]
    static int diagramSum(int[][] arr){
        int sum = 0;
        for (int i = 0 ; i < arr.length; i++) {
          sum += arr[i][i]; // primary diagonal
          sum += arr[i][arr.length - i -1]; // secondary diagonal

        }
        //If n is odd, subtract the middle element once (because it was added twice — once in each diagonal)
        // If n is odd, subtract middle element (as it's counted twice)
       if(arr.length % 2 == 1){
           sum -= arr[arr.length / 2][arr.length / 2];
       }
    return sum;
    }
}
