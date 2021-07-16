enum Weekdays {
    Monday = "first",
    Tuesday = "second",
    Wednesday = "third",
    Thursday = "fourth",
    Friday = "fifth",
    Saturday = "sixth",
    Sunday = "seventh",
  }
   
  console.log(Weekdays.Monday)         
  console.log(Weekdays["Monday"]) 
  console.log(Weekdays["first"])           
   
  let holiday=Weekdays.Sunday;
  console.log(holiday);                
   
  console.log(typeof Weekdays)         
  console.log(typeof holiday)          
   