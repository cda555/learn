package com.ubikry.pattern.prototype.deep;


import java.io.Serializable;

/**
 * 轮胎类
 */
public class Tyre implements Serializable {
    //轮胎尺寸
    private Integer size;

    public Tyre(Integer size){
        this.size = size;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
}
