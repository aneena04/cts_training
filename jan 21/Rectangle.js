// class Rectangle {
//     constructor(height, width) {
//       this.height = height;
//       this.width = width;
//     }
//     // Getter
//     get area() {
//       return this.calcArea();
//     }
//     // Method
//     calcArea() {
//       return this.height * this.width;
//     }
//   }
  
//   const square = new Rectangle(70, 10);
  
//   console.log(square.area); 

//static method
class Point{
    constructor(x,y){
        this.x=x
        this.y=y
    }
    static distance(a, b) {
        const dx = a.x - b.x;
        const dy = a.y - b.y;
    
        return Math.hypot(dx, dy);
      }
    }
    const p1 = new Point(5, 5);
const p2 = new Point(12, 10);
p1.distance; 
p2.distance; 

console.log(Point.distance(p1, p2));

