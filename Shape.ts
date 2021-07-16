class Shape{
    name : string;
    side : number;
     
    //constructor
    constructor(name : string, side : number ){
        this .name = name;
        this .side = side;
    }
    //method
    displayAs(): void{
        console.log(this);
    }
}
let shape : Shape = new Shape (" square ", 4);
shape. displayAs();