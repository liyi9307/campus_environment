package com.ncepu.campus_environment.entity;

public class CampusPM {
    private int id;
    private String node;
    private String airPM1;//PM1.0
    private String airPM25;//PM2.5
    private String airPM10;//PM10

    public CampusPM() {
    }

    public CampusPM(String node, String airPM1, String airPM25, String airPM10) {
        this.node = node;
        this.airPM1 = airPM1;
        this.airPM25 = airPM25;
        this.airPM10 = airPM10;
    }

    public CampusPM(int id, String node, String airPM1, String airPM25, String airPM10) {
        this.id = id;
        this.node = node;
        this.airPM1 = airPM1;
        this.airPM25 = airPM25;
        this.airPM10 = airPM10;
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

    public String getAirPM1() {
        return airPM1;
    }

    public void setAirPM1(String airPM1) {
        this.airPM1 = airPM1;
    }

    public String getAirPM25() {
        return airPM25;
    }

    public void setAirPM25(String airPM25) {
        this.airPM25 = airPM25;
    }

    public String getAirPM10() {
        return airPM10;
    }

    public void setAirPM10(String airPM10) {
        this.airPM10 = airPM10;
    }

    @Override
    public String toString() {
        return "CampusPM{" +
                "id=" + id +
                ", node='" + node + '\'' +
                ", airPM1='" + airPM1 + '\'' +
                ", airPM25='" + airPM25 + '\'' +
                ", airPM10='" + airPM10 + '\'' +
                '}';
    }
}
