package com.fullstackproject.geodataapi.controller;

import com.fullstackproject.geodataapi.model.Country;
import com.fullstackproject.geodataapi.model.Language;
import com.fullstackproject.geodataapi.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/countries")
public class CountryController {
    @Autowired
    private CountryService countryService;

    @GetMapping
    public List<Country> getAllCountries() {
        return countryService.getAllCountries();
    }

    @GetMapping("/{countryId}/languages")
    public List<Language> getLanguagesByCountryId(@PathVariable Integer countryId) {
        return countryService.getLanguagesByCountryId(countryId);
    }
}