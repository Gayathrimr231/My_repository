"use strict";
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
exports.__esModule = true;
var oops_demo_1 = require("./oops_demo");
var Student2 = /** @class */ (function () {
    function Student2(status) {
        this.status = status;
    }
    Student2.prototype.move = function (fees) {
        if (fees === void 0) { fees = 0; }
        console.log(this.status + " & fees amount is : " + fees);
    };
    return Student2;
}());
var Idhaya = /** @class */ (function (_super) {
    __extends(Idhaya, _super);
    function Idhaya(Marks, status) {
        var _this = _super.call(this, status) || this;
        _this.Marks = Marks;
        return _this;
    }
    Idhaya.prototype.move = function (fees) {
        if (fees === void 0) { fees = 5000; }
        console.log(" Updating Databases");
        _super.prototype.move.call(this, fees);
    };
    Idhaya.prototype.display = function () {
        console.log(" student marks :" + this.Marks);
        console.log(" student status :" + this.status);
    };
    return Idhaya;
}(Student2));
var exe = new oops_demo_1.Student(' Gayathri', 23, 'Female');
exe.displayInfo();
var exe1 = new Idhaya(90, " Studying");
exe1.move(5000);
exe1.display();
