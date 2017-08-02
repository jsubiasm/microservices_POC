/* tslint:disable:no-unused-variable */

import { TestBed, async } from '@angular/core/testing';
import { AppComponent } from './app.component';
import { AddPersonaComponent } from './add-persona/add-persona.component';
import { UpdatePersonaComponent } from './update-persona/update-persona.component';
import { FindPersonaComponent } from './find-persona/find-persona.component';
import { DeletePersonaComponent } from './delete-persona/delete-persona.component';
import { ListPersonasComponent } from './list-personas/list-personas.component';

describe('AppComponent', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [
        AppComponent,
        AddPersonaComponent,
        UpdatePersonaComponent,
        FindPersonaComponent,
        DeletePersonaComponent,
        ListPersonasComponent        
      ],
    });
    TestBed.compileComponents();
  });

  it('should create the app', async(() => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.debugElement.componentInstance;
    expect(app).toBeTruthy();
  }));

  it(`should have as title 'Prueba Concepto API RESTful'`, async(() => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.debugElement.componentInstance;
    expect(app.title).toEqual('Prueba Concepto API RESTful');
  }));

  it('should render title in a h4 tag', async(() => {
    const fixture = TestBed.createComponent(AppComponent);
    fixture.detectChanges();
    const compiled = fixture.debugElement.nativeElement;
    expect(compiled.querySelector('h4').textContent).toContain('Prueba Concepto API RESTful');
  }));
});
