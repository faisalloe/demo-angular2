/**
 * Created by FaisalKhan on 6/15/16.
 */

import { Component } from '@angular/core';
import {AjaxRequestService} from './ajax.req.service';

@Component({
    selector: 'dashboard-app',
    templateUrl:'app/dashboard.html',
    providers: [

    ]
})

export class DashboardComponent{

msg: string = "Welcome to the Dash board.. please click any of the links above to play around.";


}