var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let nomeVendedor = lines.shift();
let salarioFixo = parseFloat(lines.shift());
let totalVendas = parseFloat(lines.shift());
let salarioBonus = salarioFixo + (totalVendas * 15) / 100;

console.log("TOTAL = R$ " + salarioBonus.toFixed(2));
