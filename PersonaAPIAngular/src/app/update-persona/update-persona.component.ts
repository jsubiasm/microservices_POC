import { Component, OnInit } from '@angular/core';

import { UpdatePersonaBody } from '../../model/UpdatePersonaBody';

@Component({
  selector: 'app-update-persona',
  templateUrl: './update-persona.component.html',
  styleUrls: ['./update-persona.component.css']
})
export class UpdatePersonaComponent implements OnInit {

    persona: UpdatePersonaBody;
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
            this.resultadoMSG = "Persona modificada correctamente";
        }
        catch ( error ) {
            this.resultOK = false;
            this.resultERR = true;
            this.resultadoMSG = "Error [" + error.message + "]";
        }
    }

}
