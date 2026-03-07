package com.basics.oops.pillars.inheritance.multiple;

public interface Icecream1 {
    String Icecream1();
}
interface Icecream2 {
    String Icecream2();
}
interface Icecream3 {
    String Icecream3();
}
class Icecreams implements Icecream1,Icecream2,Icecream3 {

    @Override
    public String Icecream1() {
        return "ButterScotch";
    }

    @Override
    public String Icecream2() {
        return "Vanilla";

    }

    @Override
    public String Icecream3() {
        return"Blueberry";

    }

    public static void main(String[] args) {
        Icecreams icecream = new Icecreams();
        System.out.println("Customer likes: "+ icecream.Icecream1());
        System.out.println("Customer likes : "+icecream.Icecream2());
        System.out.println("Customer likes :" +icecream.Icecream3());

    }
}