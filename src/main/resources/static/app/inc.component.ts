import { Component } from '@angular/core';

import {AjaxRequestService} from './ajax.req.service';

@Component({
    selector: 'inc-app',
    templateUrl:'app/increment.html',
    providers: [
        AjaxRequestService,
    ]
})


export class IncComponent {


    constructor(private ajaxService: AjaxRequestService){
    }

    result: number;

    increment(){

    this.ajaxService.incrementNumber().then( resp => this.result=resp);

    }


}
