var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let linha = lines.shift().split(" ");
let a = parseInt(linha[0]);
let b = parseInt(linha[1]);
let c = parseInt(linha[2]);

let maior = (a + b + Math.abs(a - b)) / 2;
maior = (maior + c + Math.abs(maior - c)) / 2;

console.log(maior + " eh o maior");
