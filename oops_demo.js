"use strict";
exports.__esModule = true;
exports.Student = void 0;
var Student = /** @class */ (function () {
    //constructor
    function Student(personName, age, gender) {
        this.personName = personName;
        this.age = age;
        this.gender = gender;
    }
    //methods
    Student.prototype.displayInfo = function () {
        console.log(this.personName + " is a " + this.gender + " with age: " + this.age);
    };
    return Student;
}());
exports.Student = Student;
//creating my objects
var exe = new Student('Gayathri', 22, 'Female');
exe.displayInfo();
var exe1 = new Student('Nivetha', 23, 'Female');
exe1.displayInfo();
var exe2 = new Student('Rakshitha', 24, 'Female');
exe2.displayInfo();
