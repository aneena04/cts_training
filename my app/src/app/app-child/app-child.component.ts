import { Component, OnInit, Input, Output } from '@angular/core';
import {EventEmitter  } from "@angular/core";

@Component({
  selector: 'app-app-child',
  templateUrl: './app-child.component.html',
  styleUrls: ['./app-child.component.css']
})
export class AppChildComponent implements OnInit {

  constructor() { }
 
  message="Hello From Child";
  @Output()childMessage= new EventEmitter<string>()
  
  @Input()messageFromParent:String;
  
  ngOnInit() {
  }
  send(){
    this.childMessage.emit(this.message)

  }

}
