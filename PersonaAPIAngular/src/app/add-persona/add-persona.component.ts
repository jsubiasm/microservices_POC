import { Component, OnInit } from '@angular/core';

import { AddPersonaBody } from '../../model/AddPersonaBody';

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

    constructor() {
    }

    focus() {
        this.resultOK = false;
        this.resultERR = false;
        this.resultadoMSG = "";
    }

    init() {
        this.persona = { id: null, nombre: "", profesion: "" };
        this.focus();
    }

    ngOnInit() {
        this.init();
    }

    onSubmit() {
        try {
            this.resultOK = true;
            this.resultERR = false;
            this.resultadoMSG = "Persona insertada [" + this.persona.nombre + "] [" + this.persona.profesion + "]";
        }
        catch ( error ) {
            this.resultOK = false;
            this.resultERR = true;
            this.resultadoMSG = "Error [" + error.message + "]";
        }
    }

}
