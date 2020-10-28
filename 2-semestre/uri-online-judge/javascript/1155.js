var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let s = 1;

for (let i = 2; i <= 100; i++) {
    s += 1 / i;
}

console.log(`${s.toFixed(2)}`);
