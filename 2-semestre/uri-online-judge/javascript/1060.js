var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let array = [];
let totPositivos = 0;

for (let i = 0; i < 6; i++) {
    array[i] = parseFloat(lines.shift());
    
    if (array[i] > 0) totPositivos++;
}

console.log(totPositivos + " valores positivos");
