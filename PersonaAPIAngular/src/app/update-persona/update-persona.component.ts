import { Component, OnInit } from '@angular/core';

import { UpdatePersonaBody } from '../../model/UpdatePersonaBody';
import { PersonasApi } from '../../api/PersonasApi';

@Component( {
    selector: 'app-update-persona',
    templateUrl: './update-persona.component.html',
    styleUrls: ['./update-persona.component.css']
})
export class UpdatePersonaComponent implements OnInit {

    persona: UpdatePersonaBody;
    resultOK: boolean;
    resultERR: boolean;
    resultadoMSG: String;

    constructor( private api: PersonasApi ) {
    }

    cleanMsg() {
        this.resultOK = false;
        this.resultERR = false;
        this.resultadoMSG = "";
    }

    init() {
        this.persona = { id: "", nombre: "", profesion: "" };
        this.cleanMsg();
    }

    ngOnInit() {
        this.init();
    }

    onSubmit() {
        try {
            this.api.updatePersona( this.persona ).subscribe(
                response => {
                    this.persona = response;
                    this.resultOK = true;
                    this.resultERR = false;
                    this.resultadoMSG = "Persona modificada correctamente";
                    console.log( response );
                },
                err => {
                    this.resultOK = false;
                    this.resultERR = true;
                    this.resultadoMSG = "Error modificando persona (status:" + err.status + ")";
                    console.error( err );
                },
                () => {
                    console.log( "Fin observable" );
                }
            );
        }
        catch ( error ) {
            this.resultOK = false;
            this.resultERR = true;
            this.resultadoMSG = "Error [" + error.message + "]";
        }
    }

}
