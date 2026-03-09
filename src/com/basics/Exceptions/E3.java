package com.basics.Exceptions;

public class E3 {
    static void checkAge(int age){
        if(age >= 18){
            System.out.println("Access granted - eligible");
        }else {
            throw new RuntimeException("Access denied - Not eligible.");
        }
        System.out.println("User starts the app!");
    }
    public static void main(String[] args) {
        checkAge(35);
    }
}
