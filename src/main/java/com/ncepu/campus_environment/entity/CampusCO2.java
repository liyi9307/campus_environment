package com.ncepu.campus_environment.entity;

import java.sql.Timestamp;

public class CampusCO2 {
    private int id;
    private String node;
    private String airCO2;
    private Timestamp receiveTime;

    public CampusCO2() {
    }

    public CampusCO2(String node, String airCO2, Timestamp receiveTime) {
        this.node = node;
        this.airCO2 = airCO2;
        this.receiveTime = receiveTime;
    }

    public CampusCO2(int id, String node, String airCO2, Timestamp receiveTime) {
        this.id = id;
        this.node = node;
        this.airCO2 = airCO2;
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

    public String getAirCO2() {
        return airCO2;
    }

    public void setAirCO2(String airCO2) {
        this.airCO2 = airCO2;
    }

    public Timestamp getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(Timestamp receiveTime) {
        this.receiveTime = receiveTime;
    }

    @Override
    public String toString() {
        return "CampusCO2{" +
                "id=" + id +
                ", node='" + node + '\'' +
                ", airCO2='" + airCO2 + '\'' +
                ", receiveTime=" + receiveTime +
                '}';
    }
}
