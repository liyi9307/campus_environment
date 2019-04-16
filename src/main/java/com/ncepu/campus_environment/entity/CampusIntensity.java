package com.ncepu.campus_environment.entity;

import java.sql.Timestamp;

public class CampusIntensity {
    private int id;
    private String node;
    private String intensity;
    private Timestamp receiveTime;

    public CampusIntensity() {
    }

    public CampusIntensity(String node, String intensity, Timestamp receiveTime) {
        this.node = node;
        this.intensity = intensity;
        this.receiveTime = receiveTime;
    }

    public CampusIntensity(int id, String node, String intensity, Timestamp receiveTime) {
        this.id = id;
        this.node = node;
        this.intensity = intensity;
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

    public String getIntensity() {
        return intensity;
    }

    public void setIntensity(String intensity) {
        this.intensity = intensity;
    }

    public Timestamp getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(Timestamp receiver_time) {
        this.receiveTime = receiver_time;
    }

    @Override
    public String toString() {
        return "CampusIntensity{" +
                "id=" + id +
                ", node='" + node + '\'' +
                ", intensity='" + intensity + '\'' +
                ", receiveTime=" + receiveTime +
                '}';
    }
}
