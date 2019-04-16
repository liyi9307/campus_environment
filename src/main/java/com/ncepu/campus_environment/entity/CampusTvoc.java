package com.ncepu.campus_environment.entity;


import java.sql.Timestamp;

public class CampusTvoc {
    private int id;
    private String node;
    private String tvoc;
    private Timestamp receiveTime;

    public CampusTvoc() {
    }

    public CampusTvoc(String node, String tvoc, Timestamp receiveTime) {
        this.node = node;
        this.tvoc = tvoc;
        this.receiveTime = receiveTime;
    }

    public CampusTvoc(int id, String node, String tvoc, Timestamp receiveTime) {
        this.id = id;
        this.node = node;
        this.tvoc = tvoc;
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

    public String getTvoc() {
        return tvoc;
    }

    public void setTvoc(String tvoc) {
        this.tvoc = tvoc;
    }

    public Timestamp getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(Timestamp receiveTime) {
        this.receiveTime = receiveTime;
    }

    @Override
    public String toString() {
        return "CampusTvoc{" +
                "id=" + id +
                ", node='" + node + '\'' +
                ", tvoc='" + tvoc + '\'' +
                ", receiveTime=" + receiveTime +
                '}';
    }
}
