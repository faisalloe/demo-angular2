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

    result: number=0;
    constructor(private ajaxService: AjaxRequestService){
    }

    increment(){

    this.ajaxService.incrementNumber().then( resp => this.result=resp);

    }


}
