/* tslint:disable:no-unused-variable */

import { TestBed, async } from '@angular/core/testing';

import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';
import { RouterModule } from '@angular/router';
import { APP_BASE_HREF } from '@angular/common';

import { AppComponent } from './app.component';
import { CrudPersonasComponent } from './crud-personas/crud-personas.component';
import { AddPersonaComponent } from './add-persona/add-persona.component';
import { UpdatePersonaComponent } from './update-persona/update-persona.component';
import { FindPersonaComponent } from './find-persona/find-persona.component';
import { DeletePersonaComponent } from './delete-persona/delete-persona.component';
import { ListPersonasComponent } from './list-personas/list-personas.component';

import { PersonasApi } from '../api/PersonasApi';

describe( 'AppComponent', () => {
    beforeEach(() => {
        TestBed.configureTestingModule( {
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
