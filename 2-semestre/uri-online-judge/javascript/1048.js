var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let salario = parseFloat(lines.shift());
    
let reaj15 = (salario * 15) / 100;
let reaj12 = (salario * 12) / 100;
let reaj10 = (salario * 10) / 100;
let reaj7 = (salario * 7) / 100;
let reaj4 = (salario * 4) / 100;

if (salario >= 0 && salario <= 400.00) {
    console.log("Novo salario: " + (salario+reaj15).toFixed(2));
    console.log("Reajuste ganho: " + (reaj15).toFixed(2));
    console.log("Em percentual: 15 %");
} else if (salario >= 400.01 && salario <= 800.00) {
    console.log("Novo salario: " + (salario+reaj12).toFixed(2));
    console.log("Reajuste ganho: " + (reaj12).toFixed(2));
    console.log("Em percentual: 12 %");
} else if (salario >= 800.01 && salario <= 1200.00) {
    console.log("Novo salario: " + (salario+reaj10).toFixed(2));
    console.log("Reajuste ganho: " + (reaj10).toFixed(2));
    console.log("Em percentual: 10 %");
} else if (salario >= 1200.01 && salario <= 2000.00) {
    console.log("Novo salario: " + (salario+reaj7).toFixed(2));
    console.log("Reajuste ganho: " + (reaj7).toFixed(2));
    console.log("Em percentual: 7 %");
} else if (salario > 2000.01) {
    console.log("Novo salario: " + (salario+reaj4).toFixed(2));
    console.log("Reajuste ganho: " + (reaj4).toFixed(2));
    console.log("Em percentual: 4 %");
}
