import { Component, OnInit } from '@angular/core';
import{ FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-add-students',
  templateUrl: './add-students.component.html',
  styleUrls: ['./add-students.component.css']
})
export class AddStudentsComponent implements OnInit {

userForm: FormGroup;
listData:any;



constructor(private fb:FormBuilder){
   
  this.listData=[];

  this.userForm=this.fb.group ({
    name :['',Validators.required],
    rollNo:['',Validators.required],
    email:['',Validators.required],
    gender:['',Validators.required],


  })
}

public addItem() : void{
  this.listData.push(this.userForm.value);
  this.userForm.reset();
  
}

reset() {
  this.userForm.reset();
  
}
removeItem(element:String){
  this.listData.forEach((value:String,index:number) => {
    if(value == element)
    this.listData.splice(index,1);
  });
}

  ngOnInit() {
  }

}
