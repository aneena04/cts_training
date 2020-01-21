// function retStr() { 
//     return "hello world!!!" 
//  }  
//  let val = retStr() 
//  console.log(val) 


 //default parameter


//  function add(a, b = 5) { 
//     return a+b; 
//  } 
//  console.log(add(4))

//rest parameter--> not restricted on number of parameters



// function f1(...params){
//     console.log(params.length)
// }
// f1();
// f1(5)
// f1(2,6,4)


//function constrctor-->to define anonymous functions

let func = new Function("x", "y", "return x*y;"); 
function product() { 
   let result; 
   result = func(10,20); 
   console.log("The product : "+result)
} 
product()

//anonymous recursive function-->calls itself by ()
(function() { 
    var msg = "Hello World" 
    console.log(msg)
 })()

//lambda functions

let f=(x)=>10+x
console.log(f(5))

//lambda stmt

let msg=()=>{
    console.log("function")
}
msg()

