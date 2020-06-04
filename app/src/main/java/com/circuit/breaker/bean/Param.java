package com.circuit.breaker.bean;
//参数子项
public class Param {
    String value;
    String name;

    public Param(String name,String value){
        this.name = name;
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
