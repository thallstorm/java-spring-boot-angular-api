package com.fullstackproject.geodataapi.mapper;

import com.fullstackproject.geodataapi.model.CountryStats;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CountryStatsMapper {
    @Select("SELECT c.name, c.country_code3, cs.year, cs.population, cs.gdp " +
            "FROM countries c " +
            "FULL OUTER JOIN country_stats cs ON c.country_id = cs.country_id " +
            "WHERE (cs.gdp / cs.population) = " +
            "(SELECT MAX(gdp / population) FROM country_stats WHERE country_id = cs.country_id)")
    List<CountryStats> getMaxGdpPerPopulationRatioStats();
}

