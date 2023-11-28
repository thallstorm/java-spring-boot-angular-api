package com.fullstackproject.geodataapi.mapper;

import com.fullstackproject.geodataapi.dto.FilteredDataDto;
import com.fullstackproject.geodataapi.model.Continent;
import com.fullstackproject.geodataapi.model.Region;
import com.fullstackproject.geodataapi.model.Country;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface GeographyMapper {
    @Select("SELECT * FROM continents")
    List<Continent> getAllContinents();

    @Select("SELECT * FROM regions")
    List<Region> getAllRegions();

    @Select("SELECT r.name as region_name, ct.name as continent_name, co.name as country_name, cs.year, cs.population, cs.gdp " +
            "FROM country_stats cs " +
            "INNER JOIN countries co ON cs.country_id = co.country_id " +
            "INNER JOIN regions r ON co.region_id = r.region_id " +
            "INNER JOIN continents ct ON r.continent_id = ct.continent_id " +
            "WHERE r.region_id = #{regionId} " +
            "AND cs.year BETWEEN #{fromYear} AND #{toYear}")
    List<FilteredDataDto> getCountryStatsByRegionAndYear(@Param("regionId") Integer regionId, @Param("fromYear") Integer fromYear, @Param("toYear") Integer toYear);
}


