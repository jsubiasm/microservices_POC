import { Component, OnInit } from '@angular/core';

import { InlineResponse200 } from '../../model/InlineResponse200';

@Component( {
    selector: 'app-list-personas',
    templateUrl: './list-personas.component.html',
    styleUrls: ['./list-personas.component.css']
})
export class ListPersonasComponent implements OnInit {

    listaPersonas: Array<InlineResponse200>;
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
        this.listaPersonas = [{ id: "111", nombre: "111", profesion: "111" }, { id: "222", nombre: "222", profesion: "222" }];
        this.cleanMsg();
    }

    ngOnInit() {
        this.init();
    }

    onSubmit() {
        try {
            this.resultOK = true;
            this.resultERR = false;
            this.resultadoMSG = "Listado actualizado";
        }
        catch ( error ) {
            this.resultOK = false;
            this.resultERR = true;
            this.resultadoMSG = "Error [" + error.message + "]";
        }
    }

}
