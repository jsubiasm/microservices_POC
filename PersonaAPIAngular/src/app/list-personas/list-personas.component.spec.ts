/* tslint:disable:no-unused-variable */
import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { By } from '@angular/platform-browser';
import { DebugElement } from '@angular/core';

import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';

import { PersonasApi } from '../../api/PersonasApi';

import { ListPersonasComponent } from './list-personas.component';

describe('ListPersonasComponent', () => {
  let component: ListPersonasComponent;
  let fixture: ComponentFixture<ListPersonasComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ListPersonasComponent ],
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
    fixture = TestBed.createComponent(ListPersonasComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
