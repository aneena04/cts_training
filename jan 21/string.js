//syntax
//var val = new String(string);


//string constrctor
// let str = new String( "This is string" ); 
// console.log("str.constructor is:" + str.constructor)
// console.log(str) 
// console.log("Length "+str.length)  //length of string inclding whitespaces


//prototype property-->to add properties and methods to existing objects
// function emp(id,name){
// this.id=id;
// this.name=name;
// }
// let emp1=new emp(123,"aneena")
// emp.prototype.email="aneena@gmail.com"

// console.log(emp1.id)
// console.log(emp1.name)
// console.log(emp1.email)

//charAt
// let str = new String("This is string"); 
// console.log("str.charAt(0) is:" + str.charAt(0)); 
// console.log("str.charAt(1) is:" + str.charAt(1));

//charCodeAt
// let str = new String("This is string"); 
// console.log("str.charAt(0) is:" + str.charCodeAt(0)); 
// console.log("str.charAt(1) is:" + str.charCodeAt(1)); 

//concat
// let str1 = new String( "This is string one" ); 
// let str2 = new String( "This is string two" ); 
// let str3 = str1.concat( str2 ); 
// console.log("str1 + str2 : "+str3) 

//indexOf
// let index=str1.indexOf("string")
// console.log(index)
// console.log(str1.lastIndexOf("one"))
// let int=str2.localeCompare("This is string five")
// console.log(int);


//string replace
var re=/(\w+)\s(\w+)/
var str="Aneena Thomas"
var newstr=str.replace(re,"$2,$1")
console.log(newstr)

//search
var re = /apples/gi;
var str = "Apples are round, and apples are juicy."; 
if ( str.search(re) == -1 ) { 
   console.log("Does not contain Apples" ); 
} else { 
   console.log("Contains Apples" ); 
}   

//slice
console.log(str.slice(3,-2));
console.log("sliced");

//split
console.log(str.split("a",3))

//localetoupper
console.log(str.toLocaleLowerCase( ));   
