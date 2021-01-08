var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let numFunc = parseInt(lines.shift());
let horasTrab = parseInt(lines.shift());
let valorHoras = parseFloat(lines.shift());
let salario = horasTrab * valorHoras;

console.log("NUMBER = " + numFunc);
console.log("SALARY = U$ " + salario.toFixed(2));
