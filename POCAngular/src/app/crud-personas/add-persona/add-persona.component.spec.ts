/* tslint:disable:no-unused-variable */
import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { By } from '@angular/platform-browser';
import { DebugElement } from '@angular/core';

import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';

import { PersonasApi } from '../../../api/PersonasApi';

import { AddPersonaComponent } from './add-persona.component';

describe( 'AddPersonaComponent', () => {
    let component: AddPersonaComponent;
    let fixture: ComponentFixture<AddPersonaComponent>;

    beforeEach( async(() => {
        TestBed.configureTestingModule( {
            declarations: [AddPersonaComponent],
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
        fixture = TestBed.createComponent( AddPersonaComponent );
        component = fixture.componentInstance;
        fixture.detectChanges();
    });

    it( 'should create', () => {
        expect( component ).toBeTruthy();
    });
});
