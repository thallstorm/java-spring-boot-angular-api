package com.fullstackproject.geodataapi.service;

import com.fullstackproject.geodataapi.mapper.LanguageMapper;
import com.fullstackproject.geodataapi.model.Country;
import com.fullstackproject.geodataapi.model.Language;
import com.fullstackproject.geodataapi.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {
    @Autowired
    private  CountryRepository countryRepository;

    @Autowired
    private LanguageMapper languageMapper;

    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }

    public List<Language> getLanguagesByCountryId(Integer countryId) {
        return languageMapper.getLanguagesByCountryId(countryId);
    }
}