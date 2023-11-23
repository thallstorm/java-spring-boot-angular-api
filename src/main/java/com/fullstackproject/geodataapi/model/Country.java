package com.fullstackproject.geodataapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "countries")
public class Country {
    @Id
    private Integer country_id;
    private String name;
    private double area;
    private String country_code2;

//    public Country() {
//        this.country_id = country_id;
//        this.name = name;
//        this.area = area;
//        this.country_code2 = country_code2;
//    }

    public Integer getCountry_id() {
            return country_id;
    }

    public void setCountry_id(Integer country_id) {
        this.country_id = country_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getCountry_code2() {
        return country_code2;
    }

    public void setCountry_code2(String country_code2) {
        this.country_code2 = country_code2;
    }
}

