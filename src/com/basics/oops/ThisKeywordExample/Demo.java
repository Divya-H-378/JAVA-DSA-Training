package com.basics.oops.ThisKeywordExample;

public class Demo {
    // instance variable
    int i;
    void change(int x){
        i = x;
    }
    void display(){
        System.out.println("The value of i is: " + i);
    }

    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.change("Demo");
    }
}
