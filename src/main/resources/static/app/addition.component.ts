/**
 * Created by FaisalKhan on 6/15/16.
 */

import { Component } from '@angular/core';
import {AjaxRequestService} from './ajax.req.service';

@Component({
    selector: 'addition-app',
    templateUrl:'app/addition.html',
    providers: [
        AjaxRequestService,
    ]
})

export class AdditionComponent{

constructor(private ajaxService: AjaxRequestService){

}

    firstNumber:number;
    secondNumber: number;
    additionResult: number;

    add(){
        
        this.ajaxService.addTwoNumbers(this.firstNumber, this.secondNumber).then( resp => this.additionResult=resp);
    }


}