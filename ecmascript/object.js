// let person={
//     firstname:"aneena",
//     lastname:"thomas",
//     func:function(){return "Hello"}

// }
// console.log(person.firstname)
// console.log(person.lastname)
// console.log(person.func())

//es5 version
// let p="anu"
// let b={p}
// console.log(b.p)

//Object()constructor
// let myCar=new Object()
// myCar.company="Ford"
//  myCar.model="Mustang"
// myCar.year=1997

// console.log(myCar["company"])
// console.log(myCar["model"])
// console.log(myCar["year"])


//object's property key can be a dynamic value
// let myCar=new Object()
// let ps="company"
// myCar[ps]="FORD"
// console.log(myCar.company)

//constructor function
// function fname(){
//     this.company="Ford"
//}
//fname -->function name
//ps-->object name
//company-->property name
// let ps=new fname()
// console.log(ps.company)


//object.create method
// let roles={
//     type:"admin",
//     displayType:function()  {
//     console.log(this.type)}
// }
// let super_role=Object.create(roles)
// super_role.displayType()

// let guest_role=Object.create(roles)
// guest_role.type="Guest"
// guest_role.displayType()



//object.assign
// let val={name:"Aneena",
// ID:"E000002"
// }
// let copy=Object.assign({},val)
// //val assigned to{} and then assigned to copy
// console.log(copy)
// for(let val in copy)
// {
//     console.log(copy[val])
// }


//deleting  property
// let myObj=new Object
// myObj.a=5
// myObj.b=6

// delete myObj.a
// console.log(myObj)
// console.log("a" in myObj)

//comparing 2 objects

//let obj1={name:"anu"}
//let obj2={name:"anu"}
// let obj2=obj1
// console.log(obj1==obj2)


//object destructring
let emp={name:"Aneena",Id:1003}
let {name,Id}=emp
console.log(name);
console.log(Id);