import { Component } from '@angular/core';

// @Component({
//   selector: 'app-root',
//   template: `<button style='color:yellow' [ngStyle]="MyStyle()">ANEENA THOMAS</button>` 
//   // templateUrl: './app.component.html',
//   // styleUrls: ['./app.component.css']
// })
@Component({    
  selector: 'app-root',    
  template: `<h2>{{title}}</h2>      
<p *ngIf="showElement">Show Element</p>      
<div [ngSwitch]="inpvalue">      
<p style='color:blue'  *ngSwitchCase="1">You have selected M S Dhoni</p>      
<p style='color:blue'  *ngSwitchCase="2">You have selected Sachin Tendulkar</p>      
<p style='color:blue'  *ngSwitchCase="3">You have selected Satyaprakash Samantaray</p>     
<p style='color:red'  *ngSwitchDefault>Sorry! Invalid selection....</p>      
</div>`      
})    
export class AppComponent {    
  
  inpvalue: number = 1;    
}

// export class AppComponent {
//   isBold: boolean = true;    
// 		fontSize: number = 30;    
// 		isItalic: boolean = true;    
    
//     MyStyle() {    
//         let mystyles = {    
//             'font-weight': this.isBold ? 'bold' : 'normal',    
//             'font-style': this.isItalic ? 'italic' : 'normal',    
//             'font-size.px': this.fontSize    
//         };    
    
//         return mystyles;    
// 		}    
// 	}   
