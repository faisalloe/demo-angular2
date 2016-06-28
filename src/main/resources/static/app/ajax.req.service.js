"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};
var core_1 = require('@angular/core');
var http_1 = require('@angular/http');
require('rxjs/add/operator/toPromise');
var AjaxRequestService = (function () {
    function AjaxRequestService(http) {
        this.http = http;
        console.log(http);
    }
    AjaxRequestService.prototype.incrementNumber = function () {
        return this.http.get('/counter').toPromise()
            .then(function (response) { return parseInt(response.text()); })
            .catch(this.handleError);
    };
    AjaxRequestService.prototype.romanConverter = function (num) {
        var searchParams = new http_1.URLSearchParams();
        searchParams.set('num', num + "");
        return this.http.get('/romanNumber', {
            search: searchParams
        }).toPromise()
            .then(function (response) { return response.text(); })
            .catch(this.handleError);
    };
    AjaxRequestService.prototype.addTwoNumbers = function (num1, num2) {
        //paramsMap
        var searchParams = new http_1.URLSearchParams();
        searchParams.set('firstNumber', num1 + "");
        searchParams.set('secondNumber', num2 + "");
        //new URLSearchParams('firstNumber='+num1 + '&secondNumber='+num2)
        return this.http.get('/adder', {
            search: searchParams
        }).toPromise()
            .then(function (response) { return parseInt(response.text()); })
            .catch(this.handleError);
    };
    AjaxRequestService.prototype.handleError = function (error) {
        console.error('An error occurred', error);
        //error.message || error
        return Promise.reject(error);
    };
    AjaxRequestService = __decorate([
        core_1.Injectable(), 
        __metadata('design:paramtypes', [http_1.Http])
    ], AjaxRequestService);
    return AjaxRequestService;
}());
exports.AjaxRequestService = AjaxRequestService;
//# sourceMappingURL=ajax.req.service.js.map