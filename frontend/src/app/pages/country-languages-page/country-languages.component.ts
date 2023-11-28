import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Language } from '../../models';
import { CountryService } from '../../countries.service';

@Component({
  selector: 'app-country-languages',
  templateUrl: './country-languages.component.html',
})
export class CountryLanguagesComponent implements OnInit {
  public languages: Language[]=[];

  constructor(
    private route: ActivatedRoute,
    private countryService: CountryService
  ) { }

  ngOnInit(): void {
    const countryId = this.route.snapshot.queryParams['id'];
    if(!countryId)return;
    this.countryService.getLanguagesByCountryId(countryId).subscribe(languages => {
      this.languages = languages;
    });
  }
}