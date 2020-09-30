var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let linha1 = lines.shift().split(" ");
let x1 = parseFloat(linha1[0]);
let y1 = parseFloat(linha1[1]);

let linha2 = lines.shift().split(" ");
let x2 = parseFloat(linha2[0]);
let y2 = parseFloat(linha2[1]);

let distancia = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

console.log(distancia.toFixed(4));
