var Weekdays;
(function (Weekdays) {
    Weekdays["Monday"] = "first";
    Weekdays["Tuesday"] = "second";
    Weekdays["Wednesday"] = "third";
    Weekdays["Thursday"] = "fourth";
    Weekdays["Friday"] = "fifth";
    Weekdays["Saturday"] = "sixth";
    Weekdays["Sunday"] = "seventh";
})(Weekdays || (Weekdays = {}));
console.log(Weekdays.Monday);
console.log(Weekdays["Monday"]);
console.log(Weekdays["first"]);
var holiday = Weekdays.Sunday;
console.log(holiday);
console.log(typeof Weekdays);
console.log(typeof holiday);
