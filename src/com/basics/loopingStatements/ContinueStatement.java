package com.basics.loopingStatements;

public class ContinueStatement {
    public static void main(String[] args) {
        // continue statement skips the current value and goes to the beginning of the loop
        for (int i=1; i<5; i++){
            if(i == 3){
                continue;
            }
            System.out.println(i + " ");
        }
    }
}
