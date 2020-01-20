// var name="Aneena"
// var name="Thomas"
let name="aneena"
// let name="Malu"
test()
//problems with js
//same variable multiple times
//the scope of var keyword is function scope 
//Javascript uses hoisting(variables,functions)
function test(){
    for(let index=0;index<5;index++){
console.log(index)
// var name="anu"
   }
   console.log(index)
// var name="aneena" 
//     {
//             var name="anie"
//     }
//console.log("value of index:" +index)
// console.log(name)
// var name="anu"
}
console.log(name)
//let&const->these are block scoped not function scoped

