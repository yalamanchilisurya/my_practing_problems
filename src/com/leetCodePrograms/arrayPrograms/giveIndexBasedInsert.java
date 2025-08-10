package com.leetCodePrograms.arrayPrograms;

import java.util.ArrayList;

/*  Initially target array is empty.
From left to right read nums[i] and index[i], insert at index index[i] the value nums[i] in target array.
Repeat the previous step until there are no elements to read in nums and index.
Return the target array.

It is guaranteed that the insertion operations will be valid.



Example 1:

Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
Output: [0,4,1,3,2]
Explanation:
nums       index     target
0            0        [0]
1            1        [0,1]
2            2        [0,1,2]
3            2        [0,1,3,2]
4            1        [0,4,1,3,2]
*/
public class giveIndexBasedInsert {

    // Time Complexity of the Code is O(n^2)
    public static void main(String[] args) {

        int[] arr = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};

        int[] result = targetArray(arr,index); // calling the function
        for(int i = 0 ; i < arr.length; i ++){
            System.out.print(result[i] + " ");
        }
    }

    static int[] targetArray(int[] arr, int[] index) {
        ArrayList<Integer> list = new ArrayList<>();// create a arrayList class object
        for(int i = 0 ; i < arr.length; i ++){ // run the loop n;  O(n)---TC
            list.add(index[i], arr[i]);// adding the elements into array with shift; take the time O(n)  n-- no.of elements.

        }
        int[] target = new int[arr.length];
        for (int i = 0; i < arr.length; i++){ // again run the loop for the List array values copy into target array TC-O(n)
            target[i] = list.get(i);
        }
        return target; // target array
    }
}
