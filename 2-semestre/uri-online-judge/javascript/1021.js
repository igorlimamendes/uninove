var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let valor = lines.shift();
valor = parseInt(parseFloat(valor) * 100);

let n100 = Math.floor(valor/(100*100));
let nota = valor % (100 * 100);
let n50 = Math.floor(nota / (50 * 100));
let nota50 = nota % (50 * 100);
let n20 = Math.floor(nota50 / (20 * 100));
let nota20 = nota50 % (20 * 100);
let n10 = Math.floor(nota20 / (10 * 100));
let nota10 = nota20 % (10 * 100);
let n5 = Math.floor(nota10 / (5 * 100));
let nota5 = nota10 % (5 * 100);
let n2 = Math.floor(nota5 / (2 * 100));
let nota2 = nota5 % (2 * 100);

let m1 = Math.floor(nota2 / (1 * 100));
let moeda1 = nota2 % (1 * 100);
let m050 = Math.floor(moeda1 / (0.5 * 100));
let moeda050 = moeda1 % (0.5 * 100);
let m025 = Math.floor(moeda050 / (0.25 * 100));
let moeda025 = moeda050 % (0.25 * 100);
let m010 = Math.floor(moeda025 / (0.1 * 100));
let moeda010 = moeda025 % (0.1 * 100);
let m005 = Math.floor(moeda010 / (0.05 * 100));
let m001 = (valor % (0.05 * 100)) / (0.01 * 100);

console.log('NOTAS:');
console.log(n100 + ' nota(s) de R$ 100.00');
console.log(n50 + ' nota(s) de R$ 50.00');
console.log(n20 + ' nota(s) de R$ 20.00');
console.log(n10 + ' nota(s) de R$ 10.00');
console.log(n5 + ' nota(s) de R$ 5.00');
console.log(n2 + ' nota(s) de R$ 2.00');
console.log('MOEDAS:');
console.log(m1 + ' moeda(s) de R$ 1.00');
console.log(m050 + ' moeda(s) de R$ 0.50');
console.log(m025 + ' moeda(s) de R$ 0.25');
console.log(m010 + ' moeda(s) de R$ 0.10');
console.log(m005 + ' moeda(s) de R$ 0.05');
console.log(m001 + ' moeda(s) de R$ 0.01');
