package com.basics.methods;

import org.w3c.dom.ls.LSOutput;

public class Example2 {
    private static int n;

    static int sumOfNTerms(int n){
        return (n * (n+1)) / 2;
    }
    public static void main(String[] args) {
        // first way is to store into a variable and print
        int sum = sumOfNTerms(10);
        System.out.println(sum);
        // second way is to directly print it
        System.out.println(sumOfNTerms(100));

    }
}
