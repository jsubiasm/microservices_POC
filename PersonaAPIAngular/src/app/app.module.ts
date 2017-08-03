import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';

import { AppComponent } from './app.component';
import { AddPersonaComponent } from './add-persona/add-persona.component';
import { UpdatePersonaComponent } from './update-persona/update-persona.component';
import { FindPersonaComponent } from './find-persona/find-persona.component';
import { DeletePersonaComponent } from './delete-persona/delete-persona.component';
import { ListPersonasComponent } from './list-personas/list-personas.component';

import { PersonasApi } from '../api/PersonasApi';

@NgModule({
  declarations: [
    AppComponent,
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
  providers: [PersonasApi],
  bootstrap: [AppComponent]
})
export class AppModule { }
