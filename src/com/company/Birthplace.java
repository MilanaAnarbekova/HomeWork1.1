package com.company;

public class Birthplace {
    private String city;
    private String hospital;

    public Birthplace(String city, String hospital) {
        this.city = city;
        this.hospital = hospital;
    }

    public String getCity() {
        return city;
    }

    public String getHospital() {
        return hospital;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }
}
