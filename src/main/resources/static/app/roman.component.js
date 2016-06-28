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
var ajax_req_service_1 = require('./ajax.req.service');
var RomanComponent = (function () {
    function RomanComponent(ajaxService) {
        this.ajaxService = ajaxService;
    }
    RomanComponent.prototype.toRomanNumber = function () {
        var _this = this;
        this.ajaxService.romanConverter(this.romanNumber).then(function (resp) {
            _this.result = resp;
            _this.err = null;
        }).catch(function (error) {
            var eMsg;
            if (error._body) {
                //let resp_json = new JsonPipe().transform(error._body);
                var json = JSON.parse(error._body);
                eMsg = json.error;
            }
            else if (error.message) {
                eMsg = error.message;
            }
            else {
                eMsg = error.status ? error.status + " - " + error.statusText : 'Server error';
            }
            _this.err = eMsg;
        });
    };
    RomanComponent = __decorate([
        core_1.Component({
            selector: 'roman-app',
            templateUrl: 'app/roman.html',
            providers: [
                ajax_req_service_1.AjaxRequestService,
            ]
        }), 
        __metadata('design:paramtypes', [ajax_req_service_1.AjaxRequestService])
    ], RomanComponent);
    return RomanComponent;
}());
exports.RomanComponent = RomanComponent;
//# sourceMappingURL=roman.component.js.map