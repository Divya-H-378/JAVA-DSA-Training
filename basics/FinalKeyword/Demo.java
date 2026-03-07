package com.basics.FinalKeyword;

public final class Demo {

}
// cannot extend a final class
//class A extends Demo{
//
//}
class A{
    void show(){
        System.out.println("Show some data. ");
    }
}
class B extends A{
    // Overriding is not possible
//    @Override
//    void show(){
//        System.out.println("Show some different data. ");
//    }
}
class C{
    final int x = 200;  // It is constant
//    x = 300;  // Cannot assign value to a final variable
    void display(final int x){
//        x = 10; // Cannot assign a value to final variable 'x'
    }

}