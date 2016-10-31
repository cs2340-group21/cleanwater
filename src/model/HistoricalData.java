package model;

public class HistoricalData {
    private double latMin;
    private double latMax;
    private double longMin;
    private double longMax;
    private int year;
    private String contaminantType;

    public HistoricalData(double latMin, double latMax, double longMin, double longMax,
                          int year, String contaminantType) {
        this.latMin = latMin;
        this.latMax = latMax;
        this.longMin = longMin;
        this.longMax = longMax;
        this.year = year;
        this.contaminantType = contaminantType;
    }
    public double getLatMin() {
        return latMin;
    }

    public void setLatMin(double latMin) {
        this.latMin = latMin;
    }

    public double getLatMax() {
        return latMax;
    }

    public void setLatMax(double latMax) {
        this.latMax = latMax;
    }

    public double getLongMin() {
        return longMin;
    }

    public void setLongMin(double longMin) {
        this.longMin = longMin;
    }

    public double getLongMax() {
        return longMax;
    }

    public void setLongMax(double longMax) {
        this.longMax = longMax;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getContaminantType() {
        return contaminantType;
    }

    public void setContaminantType(String contaminantType) {
        this.contaminantType = contaminantType;
    }
}
