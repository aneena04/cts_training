import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { ExchangeService } from 'src/app/services/exchange.service';

@Component({
  selector: 'app-update-exchange',
  templateUrl: './update-exchange.component.html',
  styleUrls: ['./update-exchange.component.css']
})
export class UpdateExchangeComponent implements OnInit {

  updateExchangeForm:FormGroup;
  constructor(private formBuilder:FormBuilder,private exchangeService:ExchangeService,private router:Router) { }

  ngOnInit() {
    this.updateExchangeForm=this.formBuilder.group({

      id:[''],
     exchangename:['',Validators.required],
      contactAddress:['',Validators.required],
      brief:['',Validators.required],
      remarks:['',Validators.required]

    });
    const id=localStorage.getItem('exchangeId');
    if(+id>0){
      this.exchangeService.getExchangeById(+id).subscribe(exchange=>{
        this.updateExchangeForm.patchValue(exchange);
      });

    }
  
  }

  updateExchange()
  {
    this.exchangeService.updateExchangeInfo(this.updateExchangeForm.value).subscribe(u=>{
    this.router.navigate(['/get-exchange'])
    });
  }

}
