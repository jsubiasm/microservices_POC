import { Component, OnInit } from '@angular/core';

import { InlineResponse200 } from '../../model/InlineResponse200';
import { PersonasApi } from '../../api/PersonasApi';

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

    constructor( private api: PersonasApi ) {
    }

    cleanMsg() {
        this.resultOK = false;
        this.resultERR = false;
        this.resultadoMSG = "";
    }

    init() {
        this.listaPersonas = [];
        this.cleanMsg();
    }

    ngOnInit() {
        this.init();
    }

    onSubmit() {
        try {
            this.api.findAllPersonas().subscribe(
                response => {
                    this.listaPersonas = response;
                    this.resultOK = true;
                    this.resultERR = false;
                    this.resultadoMSG = "Listado actualizado correctamente";
                    console.log( response );
                },
                err => {
                    this.resultOK = false;
                    this.resultERR = true;
                    this.resultadoMSG = "Error buscando personas (status:" + err.status + ")";
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
