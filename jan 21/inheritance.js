//class
// class Animal { 
//     constructor(name) {
//       this.name = name;
//     }
    
//     speak() {
//       console.log(`${this.name} makes a noise.`);
//     }
//   }
  
//   class Dog extends Animal {
//     constructor(name) {
//       super(name); // call the super class constructor and pass in the name parameter
//     }
  
//     speak() {
//       console.log(`${this.name} barks.`);
//     }
//   }
  
//   let d = new Dog('Mitzie');
//   d.speak(); // Mitzie barks.



//One may also extend traditional function-based "classes":
// function Animal (name) {
//     this.name = name;  
//   }
  
//   Animal.prototype.speak = function () {
//     console.log(`${this.name} makes a noise.`);
//   }
  
//   class Dog extends Animal {
//     speak() {
//       console.log(`${this.name} barks.`);
//     }
//   }
  
//   let d = new Dog('Mitzie');
//   d.speak(); // Mitzie barks.



//. If you want to inherit from a regular object, you can instead use Object.setPrototypeOf():
const Animal = {
    speak() {
      console.log(`${this.name} makes a noise.`);
    }
  };
  
  class Dog {
    constructor(name) {
      this.name = name;
    }
  }
  
  Object.setPrototypeOf(Dog.prototype, Animal);
  
  let d = new Dog('Mitzie');
  d.speak(); // Mitzie makes a noise.
  