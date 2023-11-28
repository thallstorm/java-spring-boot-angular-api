import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CountriesListComponent } from './pages/countries-list-page/countries-list.component';
import { CountryLanguagesComponent } from './pages/country-languages-page/country-languages.component';
import { CountryStatsComponent } from './pages/country-stats-page/country-stats.component';
import { FilteredCountryStatsComponent } from './pages/filtered-country-stats-page/filtered-country-stats.component';
import { HttpClient, HttpClientModule, HttpHandler } from '@angular/common/http';
import { CountryService } from './countries.service';
import { CommonModule } from '@angular/common';

@NgModule({
  declarations: [
    AppComponent,
    CountriesListComponent,
    CountryLanguagesComponent,
    CountryStatsComponent,
    FilteredCountryStatsComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule,
    CommonModule
  ],
  providers: [HttpClient, CountryService],
  bootstrap: [AppComponent]
})
export class AppModule { }
