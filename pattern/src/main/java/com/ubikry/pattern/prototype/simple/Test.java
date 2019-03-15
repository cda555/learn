package com.ubikry.pattern.prototype.simple;

public class Test {

    public static void main(String[] args) {
        Car a = new Car();
        Car b = a.clone();
        System.out.println(b==a);
        System.out.println(b.getTyre()==a.getTyre());
    }

}
