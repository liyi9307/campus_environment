package com.ncepu.campus_environment.entity;

public class CampusNodes {
    private int id;
    private String number;
    private String name;
    private String location;

    public CampusNodes() {
    }

    public CampusNodes(String number, String name, String location) {
        this.number = number;
        this.name = name;
        this.location = location;
    }

    public CampusNodes(int id, String number, String name, String location) {
        this.id = id;
        this.number = number;
        this.name = name;
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "CampusNodes{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
