/**
 * Created by FaisalKhan on 6/15/16.
 */

import { Component } from '@angular/core';
import {AjaxRequestService} from './ajax.req.service';

@Component({
    selector: 'hello-app',
    templateUrl:'app/hello.html',
    providers: [

    ]
})

export class HelloComponent{

msg: string = "Hello i am first route.";


}