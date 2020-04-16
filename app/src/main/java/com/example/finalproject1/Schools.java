package com.example.finalproject1;

import java.io.Serializable;

public class Schools implements Serializable {

    private String name;
    private String location;
    private String facilities;
    private int number;
    private String info;
    private int imageReference;

    public Schools(String name, String location, String facilities, int number, String info, int imageReference) {
        this.name = name;
        this.location = location;
        this.facilities = facilities;
        this.number = number;
        this.info = info;
        this.imageReference = imageReference;
    }

    public String getFacilities() {
        return facilities;
    }

    public void setFacilities(String facilities) {
        this.facilities = facilities;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getImageReference() {
        return imageReference;
    }

    public void setImageReference(int imageReference) {
        this.imageReference = imageReference;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
