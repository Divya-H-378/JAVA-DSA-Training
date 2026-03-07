package com.basics.oops.pillars.abstraction.abstractClasses;

abstract class Vehicle {
    // In java, there are 2 types of methods;
    // 1. Normal or concrete
    void vehicle_type(){
        System.out.printf("Two Wheeler or four wheeler.");
    }
    // 2. Abstract method
    abstract void start();
        // This abstract method will be defined in the child class
    // if there are only abstract methods - 100% abstraction
    //if there is even 1 normal method - not 100% abstraction
    }
class Meteor350 extends Vehicle {
    @Override
    void start() {
        System.out.println("Meteor350 starts with self.");
    }
}
class TataHexa extends Vehicle {
    @Override
    void start(){
        System.out.println("Hexa starts with key.");
    }
}
class Demo {
    public static void main(String[] args) {
        Meteor350 bike = new Meteor350();
        TataHexa car = new TataHexa();
        bike.start();
        bike.vehicle_type();
        car.start();
        car.vehicle_type();
    }
}
