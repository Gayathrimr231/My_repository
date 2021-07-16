//Arrow function
var Sum = function (X, Y) {
    return X + Y;
};
console.log(Sum(20, 22));
var result = function (a, b) {
    return a + b;
};
var c = result(2, 3);
console.log(c);
function get(c, d) {
    var final = c + d;
    return final;
}
var e = get(2, 5);
console.log(e);
