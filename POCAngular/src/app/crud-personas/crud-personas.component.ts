import { Component, OnInit } from '@angular/core';

import { AddPersonaBody } from '../../model/AddPersonaBody';
import { PersonasApi } from '../../api/PersonasApi';

import { environment } from '../../environments/environment';

@Component( {
    templateUrl: './crud-personas.component.html',
    styleUrls: ['./crud-personas.component.css']
})
export class CrudPersonasComponent implements OnInit {

    personasApiBasePath = environment.personasApiDefaultPath;
    gitHub = environment.gitHub;
    swaggerEditor = environment.swaggerEditor;
    jenkins = environment.jenkins;
    eureka = environment.eureka;
    bootAdmin = environment.bootAdmin;
    zipkin = environment.zipkin;
    hystrix = environment.hystrix;    

    constructor() {
    }

    ngOnInit() {
    }
    
    linkToGitHub() { window.open(this.gitHub); }
    linkToSwaggerEditor() { window.open(this.swaggerEditor); }  
    linkToJenkins() { window.open(this.jenkins); }  
    linkToEureka() { window.open(this.eureka); }  
    linkToBootAdmin() { window.open(this.bootAdmin); }  
    linkToZipkin() { window.open(this.zipkin); }  
    linkToHystrix() { window.open(this.hystrix); }  

}
