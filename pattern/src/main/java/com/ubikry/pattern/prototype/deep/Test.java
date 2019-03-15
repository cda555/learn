package com.ubikry.pattern.prototype.deep;

public class Test {

    public static void main(String[] args) {
        Car a = new Car();
        a.setTyre(new Tyre(100));
        Car b = a.clone();
        System.out.println(b==a);
        System.out.println(b.getTyre()==a.getTyre());
        System.out.println(b.getTyre());
    }

}
