var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let primeiro = lines.shift().split(" ");
let segundo = lines.shift().split(" ");

let codPeca1 = parseInt(primeiro[0]);
let numPeca1 = parseInt(primeiro[1]);
let valUniPeca1 = parseFloat(primeiro[2]);

let codPeca2 = parseInt(segundo[0]);
let numPeca2 = parseInt(segundo[1]);
let valUniPeca2 = parseFloat(segundo[2]);

let total = (numPeca1 * valUniPeca1) + (numPeca2 * valUniPeca2);

console.log("VALOR A PAGAR: R$ " + total.toFixed(2));
