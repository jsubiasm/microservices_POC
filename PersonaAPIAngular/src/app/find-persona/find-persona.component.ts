import { Component, OnInit } from '@angular/core';

import { Persona } from '../../model/Persona';

@Component({
  selector: 'app-find-persona',
  templateUrl: './find-persona.component.html',
  styleUrls: ['./find-persona.component.css']
})
export class FindPersonaComponent implements OnInit {

    persona: Persona;
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
        this.persona = { id: "", nombre: "", profesion: "" };
        this.focus();
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
