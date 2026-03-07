package com.basics.oops.pillars.abstraction.interfaces;

public interface Animal {
    // ❕ Interfaces have methods with completely empty bodies
    // ❌ Interfaces don't have normal methods
    // ✅ so they exhibit 100% abstraction
    // ❕ The methods are defined in the child class
    void run();
    void loves_to_eat();
}
class Rat implements Animal{
    @Override
    public void run() {
        System.out.println("rats run fast.");
    }
    @Override
    public void loves_to_eat() {
        System.out.println("Rats loves to eat cheese.");
    }
}
class Cat implements Animal{
    @Override
    public void run() {
        System.out.println("Cats run very fast.");
    }
    @Override
    public void loves_to_eat() {
        System.out.println("Cats loves to eat Rat.");
    }
}
class InterfaceDemo {
    public static void main(String[] args) {
        Rat rat = new Rat();
        rat.run();
        rat.loves_to_eat();
        Cat cat = new  Cat();
        cat.run();
        cat.loves_to_eat();
    }
}
