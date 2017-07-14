import { Component } from '@angular/core';
import { DefaultApi } from '../api/DefaultApi';
import { OnInit } from '@angular/core';

@Component( {
    selector: 'app-root',
    templateUrl: './app.component.html',
    styleUrls: ['./app.component.css'],
    providers: [DefaultApi]
})
export class AppComponent implements OnInit {

    constructor( private api: DefaultApi ) { }

    holamundo;
    holamundo2;

    ngOnInit(): void {

        this.api.holamundoGet().subscribe( response => { this.holamundo = response; });
        console.log( 'holamundo [' + this.holamundo + ']' );

        this.api.holamundo2Get().subscribe( response => { this.holamundo2 = response.palabra01 + " " + response.palabra02; });
        console.log( 'holamundo2 [' + this.holamundo + ']' );

    }

}
