import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

export class NavItem {
    id: number;
    name: string;
}

@Component( {
    selector: 'app-root',
    templateUrl: './app.component.html',
    styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {

    navItemArray: NavItem[] = [
        { id: 1, name: 'Trabajos' },
        { id: 2, name: 'Formación' },
        { id: 3, name: 'Cursos' }
    ];

    navItemSelected: NavItem;

    onSelect( item: NavItem ): void {
        this.navItemSelected = item;
        this.logRouterURL();
    }

    constructor(
        private router: Router ) { }

    ngOnInit() {
        this.logRouterURL();
        this.navItemSelected = this.getNavItemByName( this.getLastNavigationFragment() );
        if ( !this.navItemSelected ) {
            this.navItemSelected = this.navItemArray[0];
        }
    }

    logRouterURL() {
        console.log( "router URL [" + this.router.url + "]" );
        console.log( "last nav fragment [" + this.getLastNavigationFragment() + "]" );
    }

    getLastNavigationFragment() {
        return this.router.url.substr( this.router.url.lastIndexOf( "/" ) + 1 );
    }

    getNavItemByName( nameToFind: String ) {
        return this.navItemArray.find( item => item.name === nameToFind );
    }

}
