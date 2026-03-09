package com.basics.Exceptions;

public class E4 {
    static void withdraw(int tb, int amt){
        final int mb = 2000;
        if(tb - mb < amt){  // 6000 - 30000 = 3000 > 2000 {safe}
            throw new RuntimeException
                    ("Minimum balance of 2000 must be maintained.");
        }
        System.out.println("Withdrawl Successful!");
        System.out.println("Remaining balancec: " + (tb - amt));
    }
    public static void main(String[] args) {
        withdraw(6000,3000);
        withdraw(5000,4000);
    }
}
