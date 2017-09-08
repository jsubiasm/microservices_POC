import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { CrudPersonasComponent } from './crud-personas/crud-personas.component';

const routes: Routes = [
            {
                path: 'crud-personas',
                component: CrudPersonasComponent
            },
            {
                path: '',
                redirectTo: '/crud-personas',
                pathMatch: 'full'
            }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
