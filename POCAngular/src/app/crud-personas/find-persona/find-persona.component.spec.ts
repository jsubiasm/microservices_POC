/* tslint:disable:no-unused-variable */
import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { By } from '@angular/platform-browser';
import { DebugElement } from '@angular/core';

import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';

import { PersonasApi } from '../../../api/PersonasApi';

import { FindPersonaComponent } from './find-persona.component';

describe('FindPersonaComponent', () => {
  let component: FindPersonaComponent;
  let fixture: ComponentFixture<FindPersonaComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ FindPersonaComponent ],
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
    fixture = TestBed.createComponent(FindPersonaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
