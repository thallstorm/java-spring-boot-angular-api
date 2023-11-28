export interface Country {
    country_id: number;
    name: string;
    countryCode2: string;
    countryCode3: string;

  }
  
  export interface Language {
    language_id: number;
    language: string;

  }
  
  export interface CountryStats {
    countryId: number;
    year: number;
    population: number;
    gdp: number;

  }
  
  export interface FilteredData {
    continentName: string;
    regionName: string;
    countryName: string;
    year: number;
    population: number;
    gdp: number;

  }