package com.basics.methods;

public class Example1 {
    //to access method without object , we use static
    static int x = 10;
    static void add(int a, int b){ //Method Definition
        //  a, b -> Parameters
        //The variable in a method is called Parameter
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        // Example obj = new Example1(); //heap memory
        add(1,2); // Method Call -> 1,2 (Arguments)
        // The actual values are passed during method
        // call are arguments
        System.out.println(x);
    }
}
