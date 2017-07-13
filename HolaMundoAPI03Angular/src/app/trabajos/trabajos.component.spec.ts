/* tslint:disable:no-unused-variable */
import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { By } from '@angular/platform-browser';
import { DebugElement } from '@angular/core';

import { TrabajosComponent } from './trabajos.component';

describe('TrabajosComponent', () => {
  let component: TrabajosComponent;
  let fixture: ComponentFixture<TrabajosComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TrabajosComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TrabajosComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
