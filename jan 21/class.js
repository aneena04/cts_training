class Hello{
    //only 1 constructor in a class
    constructor(fname,lname,age){
        this.fn=fname
        this.ln=lname
        this.a=age
    }
    full_name()
    {
        return this.fn+' '+this.ln
    }
}
let hello=new Hello('Aneena','Thomas',21)
console.log('Full Name:'+hello.full_name());
//class inheritance-->extends keyword


// unnamed
// let Rectangle = class {
//     constructor(height, width) {
//       this.height = height;
//       this.width = width;
//     }
//   };
//   console.log(Rectangle.name);
  
  // named
  let Rectangle = class Rectangle2 {
    constructor(height, width) {
      this.height = height;
      this.width = width;
    }
  };
  console.log(Rectangle.name);



