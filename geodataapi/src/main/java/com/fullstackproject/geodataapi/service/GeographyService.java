package com.fullstackproject.geodataapi.service;

import com.fullstackproject.geodataapi.dto.FilteredDataDto;
import com.fullstackproject.geodataapi.mapper.GeographyMapper;
import com.fullstackproject.geodataapi.model.Continent;
import com.fullstackproject.geodataapi.model.Region;
import com.fullstackproject.geodataapi.model.CountryStats;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GeographyService {
    @Autowired
    private GeographyMapper geographyMapper;

    public List<Continent> getAllContinents() {
        return geographyMapper.getAllContinents();
    }

    public List<Region> getAllRegions() {
        return geographyMapper.getAllRegions();
    }

    public List<FilteredDataDto> getCountryStatsByRegionAndYear(Integer regionId, Integer fromYear, Integer toYear) {
        return geographyMapper.getCountryStatsByRegionAndYear(regionId, fromYear, toYear);
    }
}
