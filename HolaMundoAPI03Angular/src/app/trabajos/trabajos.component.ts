import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

export class SidebarItem {
    id: number;
    name: string;
}

@Component( {
    selector: 'app-trabajos',
    templateUrl: './trabajos.component.html',
    styleUrls: ['./trabajos.component.css']
})
export class TrabajosComponent implements OnInit {

    sidebarItemArray: SidebarItem[] = [
        { id: 1, name: 'Capgemini' },
        { id: 2, name: 'Sopra' },
        { id: 3, name: 'SIA' }
    ];

    sidebarItemSelected: SidebarItem = null;

    onSelect( item: SidebarItem ): void {
        this.sidebarItemSelected = item;
        this.logRouterURL();
    }

    constructor(
        private router: Router ) { }

    ngOnInit() {
        this.logRouterURL();
        this.sidebarItemSelected = this.getSidebarItemByName( this.getLastNavigationFragment() );
        if ( !this.sidebarItemSelected ) {
            this.sidebarItemSelected = this.sidebarItemArray[0];
        }
    }

    logRouterURL() {
        console.log( "router URL [" + this.router.url + "]" );
        console.log( "last nav fragment [" + this.getLastNavigationFragment() + "]" );
    }

    getLastNavigationFragment() {
        return this.router.url.substr( this.router.url.lastIndexOf( "/" ) + 1 );
    }

    getSidebarItemByName( nameToFind: String ) {
        return this.sidebarItemArray.find( item => item.name === nameToFind );
    }

}
