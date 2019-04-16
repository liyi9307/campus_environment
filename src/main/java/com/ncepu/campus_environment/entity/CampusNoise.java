package com.ncepu.campus_environment.entity;

public class CampusNoise {
    private int id;
    private String node;
    private String noise;
    private String receiveTime;

    public CampusNoise() {
    }

    public CampusNoise(String node, String noise, String receiveTime) {
        this.node = node;
        this.noise = noise;
        this.receiveTime = receiveTime;
    }

    public CampusNoise(int id, String node, String noise, String receiveTime) {
        this.id = id;
        this.node = node;
        this.noise = noise;
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

    public String getNoise() {
        return noise;
    }

    public void setNoise(String noise) {
        this.noise = noise;
    }

    public String getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(String receiveTime) {
        this.receiveTime = receiveTime;
    }

    @Override
    public String toString() {
        return "CampusNoise{" +
                "id=" + id +
                ", node='" + node + '\'' +
                ", noise='" + noise + '\'' +
                ", receiveTime='" + receiveTime + '\'' +
                '}';
    }
}
