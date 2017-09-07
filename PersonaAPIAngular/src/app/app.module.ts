import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';
import { RouterModule } from '@angular/router';

import { AppComponent } from './app.component';
import { CrudPersonasComponent } from './crud-personas/crud-personas.component';
import { AddPersonaComponent } from './add-persona/add-persona.component';
import { UpdatePersonaComponent } from './update-persona/update-persona.component';
import { FindPersonaComponent } from './find-persona/find-persona.component';
import { DeletePersonaComponent } from './delete-persona/delete-persona.component';
import { ListPersonasComponent } from './list-personas/list-personas.component';

import { PersonasApi } from '../api/PersonasApi';



@NgModule( {
    declarations: [
        AppComponent,
        CrudPersonasComponent,
        AddPersonaComponent,
        UpdatePersonaComponent,
        FindPersonaComponent,
        DeletePersonaComponent,
        ListPersonasComponent
    ],
    imports: [
        BrowserModule,
        FormsModule,
        HttpModule,
        RouterModule.forRoot( [
            {
                path: '',
                redirectTo: '/crud-personas',
                pathMatch: 'full'
            },
            {
                path: 'crud-personas',
                component: CrudPersonasComponent
            }
        ] )
    ],
    providers: [PersonasApi],
    bootstrap: [AppComponent]
})
export class AppModule { }
