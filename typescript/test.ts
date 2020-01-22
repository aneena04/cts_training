
//  function add(p:string, q:string) :string;

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




import {Employee} from "./class";
let employee=new Employee(101,"Minu",new Date())
console.log("Name:"+employee.name)