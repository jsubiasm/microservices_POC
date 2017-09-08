/* tslint:disable:no-unused-variable */
import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { By } from '@angular/platform-browser';
import { DebugElement } from '@angular/core';

import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';

import { PersonasApi } from '../../../api/PersonasApi';

import { DeletePersonaComponent } from './delete-persona.component';

describe('DeletePersonaComponent', () => {
  let component: DeletePersonaComponent;
  let fixture: ComponentFixture<DeletePersonaComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DeletePersonaComponent ],
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
    fixture = TestBed.createComponent(DeletePersonaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
