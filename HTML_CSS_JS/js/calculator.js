function calculate(){
var num1 = parseInt(document.getElementById('num1').value);
var num2 = parseInt(document.getElementById('num2').value);
 
console.log(typeof(num1));
console.log(typeof(num2));

var result = num1 + num2;


document.getElementById('resultsDiv').innerHTML = "Addition is : "+result;
alert(result);
return(false);
document.getElementById('resultsDiv').innerHTML = "Substraction is : "+result;
alert(result);
return(false);
document.getElementById('resultsDiv').innerHTML = "Multiplication is : "+result;
alert(result);
return(false);
document.getElementById('resultsDiv').innerHTML = "Division is : "+result;
alert(result);
return(false);
}