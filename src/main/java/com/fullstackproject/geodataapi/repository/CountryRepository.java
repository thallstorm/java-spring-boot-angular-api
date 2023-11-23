package com.fullstackproject.geodataapi.repository;

import com.fullstackproject.geodataapi.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {
    // Custom query methods if needed
}