/* tslint:disable:no-unused-variable */

import { TestBed, async } from '@angular/core/testing';

import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';
import { RouterModule } from '@angular/router';
import { APP_BASE_HREF } from '@angular/common';

import { AppComponent } from './app.component';
import { AboutComponent } from './about/about.component';
import { CrudPersonasComponent } from './crud-personas/crud-personas.component';
import { AddPersonaComponent } from './crud-personas/add-persona/add-persona.component';
import { UpdatePersonaComponent } from './crud-personas/update-persona/update-persona.component';
import { FindPersonaComponent } from './crud-personas/find-persona/find-persona.component';
import { DeletePersonaComponent } from './crud-personas/delete-persona/delete-persona.component';
import { ListPersonasComponent } from './crud-personas/list-personas/list-personas.component';

import { AppRoutingModule } from './app-routing.module';

import { PersonasApi } from '../api/PersonasApi';

describe( 'AppComponent', () => {
    beforeEach(() => {
        TestBed.configureTestingModule( {
            declarations: [
                AppComponent,
                AboutComponent,
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
                AppRoutingModule
            ],
            providers: [PersonasApi,
                { provide: APP_BASE_HREF, useValue: '/' }]
        });
        TestBed.compileComponents();
    });

    it( 'should create the app', async(() => {
        const fixture = TestBed.createComponent( AppComponent );
        const app = fixture.debugElement.componentInstance;
        expect( app ).toBeTruthy();
    }) );

});
