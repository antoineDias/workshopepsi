import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './pages/home/home.component';
import { UrbanismeComponent } from './pages/urbanisme/urbanisme.component';
import { EntraideComponent } from './pages/entraide/entraide.component';

const routes: Routes = [
  {path :'', redirectTo: 'home', pathMatch: 'full'},
  {path: 'home', component: HomeComponent},
  {path: 'urbanisme', component: UrbanismeComponent},
  {path: 'entraide', component: EntraideComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
