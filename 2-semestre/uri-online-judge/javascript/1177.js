var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

const t = parseInt(lines.shift());
let arr = [], c = 0;

for (let i = 0; i < 1000; i++) {
    arr[i] = c;
    c++;

    if (arr[i] === t-1) c = 0;

    console.log(`N[${i}] = ${arr[i]}`);
}
