package com.ncepu.campus_environment.entity;

import java.sql.Timestamp;

public class CampusAirTH {
    private int id;
    private String node;
    private String airTem;
    private String airHum;
    private Timestamp receiveTime;

    public CampusAirTH() {
    }

    public CampusAirTH(String node, String airTem, String airHum, Timestamp receiveTime) {
        this.node = node;
        this.airTem = airTem;
        this.airHum = airHum;
        this.receiveTime = receiveTime;
    }

    public CampusAirTH(int id, String node, String airTem, String airHum, Timestamp receiveTime) {
        this.id = id;
        this.node = node;
        this.airTem = airTem;
        this.airHum = airHum;
        this.receiveTime = receiveTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNode() {
        return node;
    }

    public void setNode(String node) {
        this.node = node;
    }

    public String getAirTem() {
        return airTem;
    }

    public void setAirTem(String airTem) {
        this.airTem = airTem;
    }

    public String getAirHum() {
        return airHum;
    }

    public void setAirHum(String airHum) {
        this.airHum = airHum;
    }

    public Timestamp getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(Timestamp receiveTime) {
        this.receiveTime = receiveTime;
    }

    @Override
    public String toString() {
        return "CampusAirTH{" +
                "id=" + id +
                ", node='" + node + '\'' +
                ", airTem='" + airTem + '\'' +
                ", airHum='" + airHum + '\'' +
                ", receiveTime=" + receiveTime +
                '}';
    }
}
