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

    helloworld;
    holamundo;

    ngOnInit(): void {

        this.api.helloworldGet().subscribe( response => { this.helloworld = response; });
        console.log( 'helloworld [' + this.helloworld + ']' );

        this.api.holamundoGet().subscribe( response => { this.holamundo = response.palabra01 + " " + response.palabra02; });
        console.log( 'holamundo [' + this.holamundo + ']' );

    }

}
