package com.ncepu.campus_environment.entity;

public class CampusPressure {
    private int id;
    private String node;
    private String pressure;
    private String receiveTime;

    public CampusPressure() {
    }

    public CampusPressure(String node, String pressure, String receiveTime) {
        this.node = node;
        this.pressure = pressure;
        this.receiveTime = receiveTime;
    }

    public CampusPressure(int id, String node, String pressure, String receiveTime) {
        this.id = id;
        this.node = node;
        this.pressure = pressure;
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

    public String getPressure() {
        return pressure;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public String getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(String receiveTime) {
        this.receiveTime = receiveTime;
    }

    @Override
    public String toString() {
        return "CampusPressure{" +
                "id=" + id +
                ", node='" + node + '\'' +
                ", pressure='" + pressure + '\'' +
                ", receiveTime='" + receiveTime + '\'' +
                '}';
    }
}
