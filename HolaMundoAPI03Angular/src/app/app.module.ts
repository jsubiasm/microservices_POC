import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';
import { RouterModule, Routes } from '@angular/router';

import { AppComponent } from './app.component';
import { TrabajosComponent } from './trabajos/trabajos.component';
import { CursosComponent } from './cursos/cursos.component';
import { FormacionComponent } from './formacion/formacion.component';
import { CapgeminiComponent } from './capgemini/capgemini.component';
import { SopraComponent } from './sopra/sopra.component';
import { SiaComponent } from './sia/sia.component';


const routes: Routes = [
    {
        path: 'Trabajos', component: TrabajosComponent, children: [
            { path: 'Capgemini', component: CapgeminiComponent },
            { path: 'Sopra', component: SopraComponent },
            { path: 'SIA', component: SiaComponent },
            { path: '', redirectTo: 'Capgemini', pathMatch: 'full' }
        ]
    },
    { path: 'Formación', component: FormacionComponent },
    { path: 'Cursos', component: CursosComponent },
    { path: '', redirectTo: '/Trabajos/Capgemini', pathMatch: 'full' }
];


@NgModule( {
    declarations: [
        AppComponent,
        TrabajosComponent,
        CursosComponent,
        FormacionComponent,
        CapgeminiComponent,
        SopraComponent,
        SiaComponent
    ],
    imports: [
        BrowserModule,
        FormsModule,
        HttpModule,
        RouterModule.forRoot( routes )
    ],
    providers: [],
    bootstrap: [AppComponent]
})
export class AppModule { }

