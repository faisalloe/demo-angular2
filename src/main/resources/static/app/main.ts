
import { bootstrap } from '@angular/platform-browser-dynamic';
import { HTTP_PROVIDERS } from '@angular/http';
import { Type }    from '@angular/core';
import { AppComponent } from './app.component';
import {appRouterProviders} from './app.routes';

bootstrap(<Type>AppComponent, [
    HTTP_PROVIDERS,
    appRouterProviders
]);

