var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let valor = parseInt(lines.shift());
let atual = valor;

let n100 = parseInt(atual / 100);
atual -= n100 * 100;
let n50 = parseInt(atual / 50);
atual -= n50 * 50;
let n20 = parseInt(atual / 20);
atual -= n20 * 20;
let n10 = parseInt(atual / 10);
atual -= n10 * 10;
let n5 = parseInt(atual / 5);
atual -= n5 * 5;
let n2 = parseInt(atual / 2);
atual -= n2 * 2;
let n1 = parseInt(atual);

console.log(valor);
console.log(n100 + " nota(s) de R$ 100,00");
console.log(n50 + " nota(s) de R$ 50,00");
console.log(n20 + " nota(s) de R$ 20,00");
console.log(n10 + " nota(s) de R$ 10,00");
console.log(n5 + " nota(s) de R$ 5,00");
console.log(n2 + " nota(s) de R$ 2,00");
console.log(n1 + " nota(s) de R$ 1,00");
