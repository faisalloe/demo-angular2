import { Component } from '@angular/core';
import { ROUTER_DIRECTIVES } from '@angular/router';

import {AjaxRequestService} from './ajax.req.service';

@Component({
    selector: 'app',
    templateUrl:'app/app.html',
    providers: [
        AjaxRequestService,
    ],
    directives: [ROUTER_DIRECTIVES]
})


export class AppComponent {

    title = 'Angular 2 Demo Applications';
}
