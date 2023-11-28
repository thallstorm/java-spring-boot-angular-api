import { Component, OnInit } from '@angular/core';
import { Country } from '../../models';
import { CountryService } from '../../countries.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-countries-list',
  templateUrl: './countries-list.component.html',
})
export class CountriesListComponent implements OnInit {
  public countries:Country[] = [];

  constructor(private countryService: CountryService, private router: Router) { }

  ngOnInit(): void {
    this.countryService.getAllCountries().subscribe(countries => {
      this.countries = countries;
    });
  }

  public onClick(country:Country):void{
    this.router.navigate(['/country-languages'], {queryParams:{id:country.country_id}});
  }
}
