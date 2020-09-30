var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let valor = parseInt(lines.shift());

let segundos = valor % 60;
let minutos1 = parseInt(valor - segundos) / 60;
let minutos2 = minutos1 % 60;
let horas = parseInt(minutos1 - minutos2) / 60;

console.log(horas + ':' + minutos2 + ':' + segundos);
