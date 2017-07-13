/* tslint:disable:no-unused-variable */
import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { By } from '@angular/platform-browser';
import { DebugElement } from '@angular/core';

import { CapgeminiComponent } from './capgemini.component';

describe('CapgeminiComponent', () => {
  let component: CapgeminiComponent;
  let fixture: ComponentFixture<CapgeminiComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CapgeminiComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CapgeminiComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
