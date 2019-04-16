package com.ncepu.campus_environment.entity;

import java.sql.Timestamp;

public class CampusSoil {
    private int id;
    private String node;
    private String soilHum;
    private String soilTem;
    private String soilPH;
    private Timestamp receiveTime;

    public CampusSoil() {
    }

    public CampusSoil(String node, String soilHum, String soilTem, String soilPH, Timestamp receiveTime) {
        this.node = node;
        this.soilHum = soilHum;
        this.soilTem = soilTem;
        this.soilPH = soilPH;
        this.receiveTime = receiveTime;
    }

    public CampusSoil(int id, String node, String soilHum, String soilTem,
                      String soilPH, Timestamp receiveTime) {
        this.id = id;
        this.node = node;
        this.soilHum = soilHum;
        this.soilTem = soilTem;
        this.soilPH = soilPH;
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

    public String getSoilHum() {
        return soilHum;
    }

    public void setSoilHum(String soilHum) {
        this.soilHum = soilHum;
    }

    public String getSoilTem() {
        return soilTem;
    }

    public void setSoilTem(String soilTem) {
        this.soilTem = soilTem;
    }

    public String getSoilPH() {
        return soilPH;
    }

    public void setSoilPH(String soilPH) {
        this.soilPH = soilPH;
    }

    public Timestamp getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(Timestamp receiveTime) {
        this.receiveTime = receiveTime;
    }

    @Override
    public String toString() {
        return "CampusSoil{" +
                "id=" + id +
                ", node='" + node + '\'' +
                ", soilHum='" + soilHum + '\'' +
                ", soilTem='" + soilTem + '\'' +
                ", soilPH='" + soilPH + '\'' +
                ", receiveTime=" + receiveTime +
                '}';
    }
}
