package com.basics.oops.pillars.abstraction.abstractClasses;

abstract class Shapes {
    abstract void area(int x);
}
class Square extends Shapes{
    @Override
    void area(int l) {
        System.out.println(Math.pow(l,2));
    }
}
class Circle extends Shapes {
    @Override
    void area(int r) {
        System.out.println(Math.PI * Math.pow(r, 2));
    }
}
class main {
    public static void main(String[] args) {
        Square square = new Square();
        Shapes circle = new Circle();
        square.area(5);
        circle.area(6);
    }
}