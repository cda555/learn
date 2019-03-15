package com.ubikry.pattern.prototype.deep;

import java.io.*;
import java.util.Date;

/**
 * 要被克隆的对象
 */
public class Car implements Cloneable, Serializable {

    private Tyre tyre ;

    private Date dateOfManufacture = new Date();


    public Tyre getTyre() {
        return tyre;
    }

    public void setTyre(Tyre tyre) {
        this.tyre = tyre;
    }

    public Car clone(){
        Car car = null;
        try(ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);) {
            objectOutputStream.writeObject(this);

            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);

            car = (Car) objectInputStream.readObject();


        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return car;
    }

}
