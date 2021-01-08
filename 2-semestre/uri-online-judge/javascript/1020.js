var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let idadeDias = parseInt(lines.shift());

let ano = Math.floor(idadeDias / 365);
let novoAno = idadeDias % 365;
let mes = Math.floor(novoAno / 30);
let dia = novoAno % 30;

console.log(ano + " ano(s)");
console.log(mes + " mes(es)");
console.log(dia + " dia(s)");
