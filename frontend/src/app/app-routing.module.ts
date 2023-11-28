import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CountriesListComponent } from './pages/countries-list-page/countries-list.component';
import { CountryLanguagesComponent } from './pages/country-languages-page/country-languages.component';

const routes: Routes = [{
  path: 'list',
  component: CountriesListComponent,
}, {path: 'country-languages', component:CountryLanguagesComponent}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
