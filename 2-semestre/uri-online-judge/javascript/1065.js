var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let valores = [];
let total = 0;

for (let i = 0; i < 5; i++) {
    valores[i] = parseInt(lines.shift());
    
    if (valores[i] % 2 === 0) total++;
}

console.log(total + " valores pares");
