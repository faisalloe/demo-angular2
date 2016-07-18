
import { bootstrap } from '@angular/platform-browser-dynamic';
import { HTTP_PROVIDERS } from '@angular/http';
import { Type }    from '@angular/core';
import { AppComponent } from './app.component';

bootstrap(<Type>AppComponent, [
    HTTP_PROVIDERS
]);

