package com.ncepu.campus_environment.entity;

import java.sql.Timestamp;

public class CampusWind {
    private int id;
    private String node;
    private String windSpeed;
    private String windDirection;
    private Timestamp receiveTime;

    public CampusWind() {
    }

    public CampusWind(String node, String windSpeed, String windDirection, Timestamp receiveTime) {
        this.node = node;
        this.windSpeed = windSpeed;
        this.windDirection = windDirection;
        this.receiveTime = receiveTime;
    }

    public CampusWind(int id, String node, String windSpeed, String windDirection, Timestamp receiveTime) {
        this.id = id;
        this.node = node;
        this.windSpeed = windSpeed;
        this.windDirection = windDirection;
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

    public String getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(String windSpeed) {
        this.windSpeed = windSpeed;
    }

    public String getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(String windDirection) {
        this.windDirection = windDirection;
    }

    public Timestamp getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(Timestamp receiveTime) {
        this.receiveTime = receiveTime;
    }

    @Override
    public String toString() {
        return "CampusWind{" +
                "id=" + id +
                ", node='" + node + '\'' +
                ", windSpeed='" + windSpeed + '\'' +
                ", windDirection='" + windDirection + '\'' +
                ", receiveTime=" + receiveTime +
                '}';
    }
}
