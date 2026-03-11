package com.basics.arrays.problems;

import java.util.Arrays;

public class ArrayPartitioning {
    public static void main(String[] args) {
        int[] arr = {3,8,5,1,27,6};
        System.out.println(Arrays.toString(arr));
        int l = 0;
        int r = arr.length - 1;
        while (l < r){
            if(arr[l] % 2 == 0){
                l++;  // if even numbers are at correct place, move ahead
            }
            if(arr[r] % 2 != 0){
                r--;  // if odd numbers are at correct place, move behind
            }
            if(l < r){  // if they are not at correct place, swap them
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
