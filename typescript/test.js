"use strict";
//  function add(p:string, q:string) :string;
exports.__esModule = true;
// function add(a:any, b:any) :any
// // {
// // return a+b;
// // }
// function add(x:number, y:number,z:number) :number;
// function add(a:any, b:any, c?:any) :any{
//    if(c==undefined){
//     return a+b;
//    }
// else
// return a+b+c
// }
// var concat=add("Typescript","Function Overloading");
// console.log(concat);
// var sum1=add(100,450,45)
// console.log(sum1);
var class_1 = require("./class");
var employee = new class_1.Employee(101, "Minu", new Date());
console.log("Name:" + employee.name);
