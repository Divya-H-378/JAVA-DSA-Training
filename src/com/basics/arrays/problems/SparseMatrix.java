package com.basics.arrays.problems;

public class SparseMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {0, 0, 3},
                {0, 0, 0},
                {4, 0, 0}
        };
        int rows = matrix.length; // 3
        int cols = matrix.length; // 3
        int zeroCount = 0, nonzeroCount = 0;
        // traverse the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    zeroCount++;
                } else {
                    nonzeroCount++;
                }
            }
        }
        if (zeroCount > nonzeroCount) {
            System.out.println("Matrix is sparse.");
        } else {
            System.out.println("Matrix is not sparse");
        }
    }
}
