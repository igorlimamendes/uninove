var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let n = parseInt(lines.shift());
let f = 1;

for (let i = n; i >= 1; i--) {
    f *= i;
    n--;
}

console.log(`${f}`);
