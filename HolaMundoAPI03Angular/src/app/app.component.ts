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

    title: string;

    ngOnInit(): void {

        this.api.holamundoGet().subscribe(res => {this.title = res; });
        console.log('HolaMundoAPI [' +  this.title  + ']');

    }

}
