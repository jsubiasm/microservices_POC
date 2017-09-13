import { Component, OnInit } from '@angular/core';

import { AddPersonaBody } from '../../model/AddPersonaBody';
import { PersonasApi } from '../../api/PersonasApi';

import { environment } from '../../environments/environment';

@Component( {
    templateUrl: './crud-personas.component.html',
    styleUrls: ['./crud-personas.component.css']
})
export class CrudPersonasComponent implements OnInit {

    personasApiBasePath = environment.personasApiDefaultPath;

    constructor() {
    }

    ngOnInit() {
    }

}
