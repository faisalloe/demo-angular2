import { provideRouter, RouterConfig }  from '@angular/router';

import {HelloComponent} from './hello.component';
import {DashboardComponent} from './dashboard.component';
import {IncComponent} from './inc.component';
import {AdditionComponent} from './addition.component';
import {RomanComponent} from './roman.component';


const routes: RouterConfig = [
    {
        path: '',
        component: DashboardComponent
    },
    {
        path: 'hello',
        component: HelloComponent
    },{
        path: 'increment',
        component: IncComponent
    },{
        path: 'adder',
        component: AdditionComponent
    },{
        path: 'roman',
        component: RomanComponent
    }

];

export const appRouterProviders = [
    provideRouter(routes)
];



