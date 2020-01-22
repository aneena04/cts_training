export class Employee{
    emp_id: number;
    name:string;
    dob: Date;
    constructor(emp_id: number,name:string,dob: Date){
        this.emp_id=emp_id;
        this.name=name;
        this.dob=dob
    }
}

let emplyee=new Employee(101,"rinu",new Date())
console.log('dob is'+emplyee.dob);