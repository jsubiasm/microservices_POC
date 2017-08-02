import { Component, OnInit } from '@angular/core';

import { InlineResponse200 } from '../../model/InlineResponse200';

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

    constructor() {
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
            this.resultOK = true;
            this.resultERR = false;
            this.resultadoMSG = "Persona encontrada";
        }
        catch ( error ) {
            this.resultOK = false;
            this.resultERR = true;
            this.resultadoMSG = "Error [" + error.message + "]";
        }
    }

}
