package com.fullstackproject.geodataapi.dto;

public class CountryStatsDto {
    private String name;
    private String country_code3;
    private Integer year;
    private Integer population;
    private double gdp;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry_code3() {
        return country_code3;
    }

    public void setCountry_code3(String country_code3) {
        this.country_code3 = country_code3;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public double getGdp() {
        return gdp;
    }

    public void setGdp(double gdp) {
        this.gdp = gdp;
    }
}