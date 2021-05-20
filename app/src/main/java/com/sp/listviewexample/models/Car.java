package com.sp.listviewexample.models;

import android.graphics.drawable.Drawable;

public class Car {
    private String name;
    private String cylinderCapacity;
    private String modelo;
    private String value;
    private Drawable image;

    public Car(){

    }

    public Car(String name, String cylinderCapacity, String modelo, String value, Drawable image) {
        this.setName(name);
        this.setCylinderCapacity(cylinderCapacity);
        this.setModelo(modelo);
        this.setValue(value);
        this.setImage(image);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCylinderCapacity() {
        return cylinderCapacity;
    }

    public void setCylinderCapacity(String cylinderCapacity) {
        this.cylinderCapacity = cylinderCapacity;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Drawable getImage() {
        return image;
    }

    public void setImage(Drawable image) {
        this.image = image;
    }
}
