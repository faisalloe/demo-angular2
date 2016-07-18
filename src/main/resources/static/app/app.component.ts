import { Component } from '@angular/core';
import { ROUTER_DIRECTIVES } from '@angular/router';

import {AjaxRequestService} from './ajax.req.service';
import {IncComponent} from './inc.component';
import {AdditionComponent} from './addition.component';
import {RomanComponent} from './roman.component';



@Component({
    selector: 'app',
    templateUrl:'app/app.html',
    providers: [
        AjaxRequestService,
    ],
    directives: [IncComponent, AdditionComponent, RomanComponent]
})


export class AppComponent {

    title = 'Angular 2 Demo Applications';
}
