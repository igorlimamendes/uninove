var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

const n = parseInt(lines.shift());

for (let i = 1; i <= n; i++) {
    console.log(`${i} ${Math.pow(i, 2)} ${Math.pow(i, 3)}`);
}
