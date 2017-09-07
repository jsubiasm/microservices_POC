/* tslint:disable:no-unused-variable */
import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { By } from '@angular/platform-browser';
import { DebugElement } from '@angular/core';

import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';

import { PersonasApi } from '../../api/PersonasApi';

import { CrudPersonasComponent } from './crud-personas.component';

import { AddPersonaComponent } from '../add-persona/add-persona.component';
import { UpdatePersonaComponent } from '../update-persona/update-persona.component';
import { FindPersonaComponent } from '../find-persona/find-persona.component';
import { DeletePersonaComponent } from '../delete-persona/delete-persona.component';
import { ListPersonasComponent } from '../list-personas/list-personas.component';

describe( 'CrudPersonasComponent', () => {
    let component: CrudPersonasComponent;
    let fixture: ComponentFixture<CrudPersonasComponent>;

    beforeEach( async(() => {
        TestBed.configureTestingModule( {
            declarations: [
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
                HttpModule
            ],
            providers: [PersonasApi]
        })
            .compileComponents();
    }) );

    beforeEach(() => {
        fixture = TestBed.createComponent( CrudPersonasComponent );
        component = fixture.componentInstance;
        fixture.detectChanges();
    });

    it( 'should create', () => {
        expect( component ).toBeTruthy();
    });
});
