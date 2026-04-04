package com.advanced.dsa.algos.dynamicProgramming;
// Time complexity and space complexity are large (Recursion)(Stack)(O(n))
public class FibonacciRecursion {
    public static int fib(int n){
        if (n <= 1) return n; // 0 for 0 or 1 for 1
        return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println("The fibonacci of " + n + "th is: " + fib(n));
    }
}
