export class Student{
    //Member variables or instance variables
    personName: string;
    age: number;
    gender: string;
    
    //constructor
    constructor( personName: string, age: number, gender:string){
        this.personName=personName;
        this.age=age;
        this.gender=gender;
    }
    //methods
    displayInfo(){
        console.log(`${this.personName} is a ${this.gender} with age: ${this.age}`);
    }
}

//creating my objects
let exe=new Student('Gayathri',22,'Female');
exe.displayInfo();

let exe1=new Student('Nivetha',23,'Female');
exe1.displayInfo();

let exe2=new Student('Rakshitha',24,'Female');
exe2.displayInfo();
