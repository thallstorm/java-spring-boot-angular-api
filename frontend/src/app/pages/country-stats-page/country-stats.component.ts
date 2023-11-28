import { Component, OnInit } from '@angular/core';
import { CountryStats } from '../../models';
import { CountryService } from '../../countries.service';

@Component({
  selector: 'app-country-stats',
  templateUrl: './country-stats.component.html',
})
export class CountryStatsComponent implements OnInit {
  public countryStats: CountryStats[]=[];

  constructor(private countryService: CountryService) { }

  ngOnInit(): void {
    this.countryService.getMaxGdpPerPopulationRatioStats().subscribe(stats => {
      this.countryStats = stats;
    });
  }
}
