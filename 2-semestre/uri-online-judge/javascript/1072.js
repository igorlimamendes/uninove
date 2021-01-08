var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let n = parseInt(lines.shift());
let valores = [];
let valIn = 0;
let valOut = 0;

for (let i = 0; i < n; i++) {
    valores[i] = parseInt(lines.shift());

    if (valores[i] >= 10 && valores[i] <= 20) valIn++;
    else valOut++;
}

console.log(`${valIn} in\n${valOut} out`);
