var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let totDistancia = parseInt(lines.shift());
let totCombGasto = parseFloat(lines.shift());
let consumoMedio = totDistancia / totCombGasto;

console.log(consumoMedio.toFixed(3) + " km/l");
