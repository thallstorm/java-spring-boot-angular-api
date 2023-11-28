import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Country, Language, CountryStats, FilteredData } from './models';

@Injectable()
export class CountryService {
  private baseUrl = 'http://localhost:8080/api/countries';

  constructor(private http: HttpClient) { }

  getAllCountries(): Observable<Country[]> {
    return this.http.get<Country[]>(`${this.baseUrl}`);
  }

  getLanguagesByCountryId(countryId: string): Observable<Language[]> {
    return this.http.get<Language[]>(`${this.baseUrl}/${countryId}/languages`);
  }

  getMaxGdpPerPopulationRatioStats(): Observable<CountryStats[]> {
    return this.http.get<CountryStats[]>(`${this.baseUrl}/maxGdpPerPopulationRatioStats`);
  }

  getFilteredCountryStats(regionId?: string, fromYear?: number, toYear?: number): Observable<FilteredData[]> {
    return this.http.get<FilteredData[]>(`${this.baseUrl}/filterCountryStats?regionId=${regionId}&fromYear=${fromYear}&toYear=${toYear}`);
  }
}
