package com.basics.arrays;

public class E3 {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9}; // 1 Dimensional array
        System.out.println(arr.length);
        // 2D Array or Matrix or [Array of arrays]
        int[][] matrix = {{1,2,3},   //0
                          {4,5,6},   //1
                          {7,8,9},   //2
                          {9,8,7}};  //3
        // Totol number o frows = Length of the matrix
        System.out.println(matrix.length); // Total number of rows
        System.out.println(matrix[0].length); // Length of 1st row
        for (int r = 0; r<matrix.length; r++){ // Rows
            for (int c=0; c<matrix[0].length; c++){  // Columns
                System.out.println(matrix[r][c] + " ");  //Cell [r][c]
            }
            System.out.println();
        }
        // when in a 2D Array or matrix - the rows are not equal
        // this type of an array is called "JAGGED ARRAY"  [very IMPORTANT🟨]
        char[][] languages = {{'k','a','n','n','a','d','a'},
                              {'t','e','l','u','g','u'},
                              {'h','i','n','d','i'},
                              {'t','a','m','i','l'}};
        System.out.println(languages[0].length); // Length of 1st row
        System.out.println(languages[3].length); // Length of 4th row
        // Traversal in a jagged array
        for (int r=0; r<languages.length; r++){ // row 0 till row 4
            for (int c=0; c<languages[r].length; c++){
                System.out.print(languages[r][c] + " ");
            }
            System.out.println();
        }

        int[][] jagged = {{1,2,3,4,5,6,7,8,9},
                          {1,2,3,4,5},
                          {1}};
        for (int row=0; row<jagged.length; row++){
            for (int col=0; col<jagged[row].length; col++){
                System.out.print(jagged[row][col] + " ");
            }
            System.out.println();
        }
    }
}
