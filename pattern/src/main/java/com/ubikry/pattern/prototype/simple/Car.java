package com.ubikry.pattern.prototype.simple;

import java.io.Serializable;

/**
 * 要被克隆的对象
 */
public class Car implements Cloneable, Serializable {

    private Tyre tyre ;

    public Tyre getTyre() {
        return tyre;
    }

    public void setTyre(Tyre tyre) {
        this.tyre = tyre;
    }

    public Car clone(){
        //浅克隆
        Car car = new Car();
        car.setTyre(tyre);
        return car;
    }

}
