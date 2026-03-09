package com.basics.StaticKeyword;
// static belongs to the stack memory
// no objects are needed for it
// The static block executes with the class before main()
public class Example {
    static int x = 2;
    static {
        System.out.println("open the system");
    }
    public static void main(String[] args) {
        System.out.println("SNPSU-ECE_2027");
    }
    static {
        System.out.println("start the app.");
        System.out.println("DB.start");
        System.out.println("open the files");
        System.out.println("system opens");
    }
}