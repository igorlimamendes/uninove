var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let val1 = parseFloat(lines.shift());
let val2 = parseFloat(lines.shift());
let val3 = parseFloat(lines.shift());
let val4 = parseFloat(lines.shift());
let val5 = parseFloat(lines.shift());
let val6 = parseFloat(lines.shift());

let totPositivos = 0;
let totPositivosSoma = 0;

if (val1 > 0) {
    totPositivos++;
    totPositivosSoma += val1;
}

if (val2 > 0) {
    totPositivos++;
    totPositivosSoma += val2;
}

if (val3 > 0) {
    totPositivos++;
    totPositivosSoma += val3;
} 

if (val4 > 0) {
    totPositivos++;
    totPositivosSoma += val4;
} 

if (val5 > 0) {
    totPositivos++;
    totPositivosSoma += val5;
} 

if (val6 > 0) {
    totPositivos++;
    totPositivosSoma += val6;
} 

totPositivosSoma = totPositivosSoma / totPositivos;

console.log(totPositivos + " valores positivos");
console.log(totPositivosSoma.toFixed(1));
