/* tslint:disable:no-unused-variable */
import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { By } from '@angular/platform-browser';
import { DebugElement } from '@angular/core';

import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';

import { PersonasApi } from '../../../api/PersonasApi';

import { UpdatePersonaComponent } from './update-persona.component';

describe('UpdatePersonaComponent', () => {
  let component: UpdatePersonaComponent;
  let fixture: ComponentFixture<UpdatePersonaComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ UpdatePersonaComponent ],
            imports: [
                BrowserModule,
                FormsModule,
                HttpModule
            ],
            providers: [PersonasApi]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(UpdatePersonaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
