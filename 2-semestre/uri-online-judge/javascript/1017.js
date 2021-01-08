var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let tempoGasto = parseInt(lines.shift());
let veloMedia = parseInt(lines.shift());
let litrosNec = (tempoGasto * veloMedia) / 12;

console.log(litrosNec.toFixed(3));
