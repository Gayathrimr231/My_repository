import { Student} from "./oops_demo";
class Student2 {
    personName : string  ;
    status : string;

    constructor( status: string ) {
        this.status = status;
    }
    move( fees: number=0){
        console.log(`${this.status} & fees amount is : ${fees}`);
    }
}

class Idhaya extends Student2 {
    Marks : number;

    constructor(Marks : number, status: string){
        super(status);
        this.Marks=Marks;

    }
    move ( fees:number =5000){
        console.log( " Updating Databases");
        super.move(fees);
    }

    display() : void {
        console.log(" student marks :"+ this.Marks);
        console.log(" student status :"+ this.status);
    }
}

let exe = new Student (' Gayathri',23,'Female');
exe.displayInfo();

let exe1 =new Idhaya(90,` Studying`);
exe1.move(5000);

exe1.display();