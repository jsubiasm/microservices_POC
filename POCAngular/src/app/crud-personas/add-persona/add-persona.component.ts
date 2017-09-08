import { Component, OnInit } from '@angular/core';

import { AddPersonaBody } from '../../../model/AddPersonaBody';
import { PersonasApi } from '../../../api/PersonasApi';

@Component( {
    selector: 'app-add-persona',
    templateUrl: './add-persona.component.html',
    styleUrls: ['./add-persona.component.css']
})
export class AddPersonaComponent implements OnInit {

    persona: AddPersonaBody;
    resultOK: boolean;
    resultERR: boolean;
    resultadoMSG: String;

    constructor( private api: PersonasApi ) {
    }

    cleanMsg() {
        this.resultOK = false;
        this.resultERR = false;
        this.resultadoMSG = '';
    }

    init() {
        this.persona = { id: '', nombre: '', profesion: '' };
        this.cleanMsg();
    }

    ngOnInit() {
        this.init();
    }

    onSubmit() {
        this.api.addPersona( this.persona ).subscribe(
            response => {
                this.persona = response;
                this.resultOK = true;
                this.resultERR = false;
                this.resultadoMSG = 'Persona añadida correctamente';
                console.log( response );
            },
            err => {
                this.resultOK = false;
                this.resultERR = true;
                this.resultadoMSG = 'Error añadiendo persona (status:' + err.status + ')';
                console.error( err );
            },
            () => {
                console.log( 'Fin observable' );
            }
        );
    }

}
