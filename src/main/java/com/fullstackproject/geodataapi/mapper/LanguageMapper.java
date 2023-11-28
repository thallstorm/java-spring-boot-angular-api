package com.fullstackproject.geodataapi.mapper;

import com.fullstackproject.geodataapi.model.Language;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface LanguageMapper {
    @Select("SELECT l.language_id, l.language FROM languages l " +
            "INNER JOIN country_languages cl ON l.language_id = cl.language_id " +
            "WHERE cl.country_id = #{countryId}")
    List<Language> getLanguagesByCountryId(@Param("countryId") Integer countryId);
}