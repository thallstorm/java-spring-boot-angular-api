package com.fullstackproject.geodataapi.controller;

import com.fullstackproject.geodataapi.dto.CountryStatsDto;
import com.fullstackproject.geodataapi.dto.FilteredDataDto;
import com.fullstackproject.geodataapi.model.Country;
import com.fullstackproject.geodataapi.model.CountryStats;
import com.fullstackproject.geodataapi.model.Language;
import com.fullstackproject.geodataapi.model.Region;
import com.fullstackproject.geodataapi.service.CountryService;
import com.fullstackproject.geodataapi.service.GeographyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/countries")
public class CountryController {
    @Autowired
    private CountryService countryService;

    @Autowired
    private GeographyService geographyService;

    @GetMapping
    public List<Country> getAllCountries() {
        return countryService.getAllCountries();
    }

    @GetMapping("/{countryId}/languages")
    public List<Language> getLanguagesByCountryId(@PathVariable Integer countryId) {
        return countryService.getLanguagesByCountryId(countryId);
    }

    @GetMapping("/maxGdpPerPopulationRatioStats")
    public List<CountryStatsDto> getMaxGdpPerPopulationRatioStats() {
        return countryService.getMaxGdpPerPopulationRatioStats();
    }

    @GetMapping("/filterCountryStats")
    public List<FilteredDataDto> getFilteredCountryStats(@RequestParam Integer regionId, @RequestParam Integer fromYear, @RequestParam Integer toYear) {
        return geographyService.getCountryStatsByRegionAndYear(regionId, fromYear, toYear);
    }

    @GetMapping("/regions")
    public List<Region> getAllRegions() {
        return geographyService.getAllRegions();
    }
}