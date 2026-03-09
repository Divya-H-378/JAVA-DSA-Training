package com.basics.Exceptions;  //Multi catch program

public class E2 {
    public static void main(String[] args) {
        int i, j, k = 0;
        i = 10;
        j = 10;
        try{
            k = i / j;
            String str = "SNPSU";
            System.out.println(str.charAt(9));
        }catch (ArithmeticException | StringIndexOutOfBoundsException e){
            System.out.println("Error!");
        }finally {
            System.out.println("end of execution of code.");
        }
            System.out.println("the value of k is: " + k);
        }
    }

