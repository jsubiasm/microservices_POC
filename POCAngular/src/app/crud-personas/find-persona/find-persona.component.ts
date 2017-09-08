import { Component, OnInit } from '@angular/core';

import { InlineResponse200 } from '../../../model/InlineResponse200';
import { PersonasApi } from '../../../api/PersonasApi';

@Component( {
    selector: 'app-find-persona',
    templateUrl: './find-persona.component.html',
    styleUrls: ['./find-persona.component.css']
})
export class FindPersonaComponent implements OnInit {

    persona: InlineResponse200;
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
        this.api.getPersonaPorId( this.persona.id ).subscribe(
            response => {
                this.persona = response;
                this.resultOK = true;
                this.resultERR = false;
                this.resultadoMSG = 'Persona encontrada';
                console.log( response );
            },
            err => {
                this.resultOK = false;
                this.resultERR = true;
                this.resultadoMSG = 'Error buscando persona (status:' + err.status + ')';
                console.error( err );
            },
            () => {
                console.log( 'Fin observable' );
            }
        );
    }

}
