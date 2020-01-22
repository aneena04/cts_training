"use strict";
exports.__esModule = true;
var Employee = /** @class */ (function () {
    function Employee(emp_id, name, dob) {
        this.emp_id = emp_id;
        this.name = name;
        this.dob = dob;
    }
    return Employee;
}());
exports.Employee = Employee;
var emplyee = new Employee(101, "rinu", new Date());
console.log('dob is' + emplyee.dob);
// get() 
// {
//    return this.name;
// }
// console.log(emplyee.get());
