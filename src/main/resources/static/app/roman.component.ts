import { Component } from '@angular/core';
import {JsonPipe} from '@angular/common';

import {AjaxRequestService} from './ajax.req.service';

@Component({
    selector: 'roman-app',
    templateUrl:'app/roman.html',
    providers: [
        AjaxRequestService,
    ]
})


export class RomanComponent {

    romanNumber:number;

    constructor(private ajaxService: AjaxRequestService){
    }

    result: string;
    err: string;
    toRomanNumber(){

    this.ajaxService.romanConverter(this.romanNumber).then( resp => {
        this.result=resp;
        this.err=null;
    }).catch(error =>

        {

            let eMsg: string;

            if(error._body){
                //let resp_json = new JsonPipe().transform(error._body);
                let json = JSON.parse(error._body);
                eMsg= json.error;

            }else if(error.message){
                eMsg = error.message;
            }else{
                eMsg =  error.status ? `${error.status} - ${error.statusText}` : 'Server error'
            }

            this.err = eMsg
        }

    );

    }


}
