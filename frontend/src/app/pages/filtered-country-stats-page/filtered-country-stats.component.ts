import { Component, OnInit } from '@angular/core';
import { CountryStats, FilteredData } from '../../models';
import { CountryService } from '../../countries.service';

@Component({
  selector: 'app-filtered-country-stats',
  templateUrl: './filtered-country-stats.component.html',
})
export class FilteredCountryStatsComponent implements OnInit {
  public filteredStats: FilteredData[]=[];
  public regionId?: string;
  public fromYear: number|undefined;
  public toYear: number|undefined;

  constructor(private countryService: CountryService) { }

  ngOnInit(): void {
    // Initialize regionId, fromYear, and toYear
    this.filterStats();
  }

  filterStats(): void {
    this.countryService.getFilteredCountryStats(this.regionId, this.fromYear, this.toYear).subscribe(stats => {
      this.filteredStats = stats;
    });
  }
}
