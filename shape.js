var Shape = /** @class */ (function () {
    //constructor
    function Shape(name, side) {
        this.name = name;
        this.side = side;
    }
    //method
    Shape.prototype.displayAs = function () {
        console.log(this);
    };
    return Shape;
}());
var shape = new Shape(" square ", 4);
shape.displayAs();
