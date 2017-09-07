import { Component, OnInit } from '@angular/core';

import { Persona } from '../../model/Persona';
import { PersonasApi } from '../../api/PersonasApi';

@Component( {
    selector: 'app-delete-persona',
    templateUrl: './delete-persona.component.html',
    styleUrls: ['./delete-persona.component.css']
})
export class DeletePersonaComponent implements OnInit {

    persona: Persona;
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
        this.api.deletePersona( this.persona.id ).subscribe(
            response => {
                this.persona = response;
                this.resultOK = true;
                this.resultERR = false;
                this.resultadoMSG = 'Persona eliminada correctamente';
                console.log( response );
            },
            err => {
                this.resultOK = false;
                this.resultERR = true;
                this.resultadoMSG = 'Error eliminando persona (status:' + err.status + ')';
                console.error( err );
            },
            () => {
                console.log( 'Fin observable' );
            }
        );
    }

}
