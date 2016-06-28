/**
 * Created by FaisalKhan on 6/15/16.
 */
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
var AdditionComponent = (function () {
    function AdditionComponent(ajaxService) {
        this.ajaxService = ajaxService;
    }
    AdditionComponent.prototype.add = function () {
        var _this = this;
        this.ajaxService.addTwoNumbers(this.firstNumber, this.secondNumber).then(function (resp) { return _this.additionResult = resp; });
    };
    AdditionComponent = __decorate([
        core_1.Component({
            selector: 'addition-app',
            templateUrl: 'app/addition.html',
            providers: [
                ajax_req_service_1.AjaxRequestService,
            ]
        }), 
        __metadata('design:paramtypes', [ajax_req_service_1.AjaxRequestService])
    ], AdditionComponent);
    return AdditionComponent;
}());
exports.AdditionComponent = AdditionComponent;
//# sourceMappingURL=addition.component.js.map