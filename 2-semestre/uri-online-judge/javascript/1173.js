var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let arr = [];
const n = parseInt(lines.shift());

arr[0] = n;

for (let i = 1; i < 10; i++) {
    arr[i] = arr[i-1] * 2;
}

for (let j = 0; j < 10; j++) {
    console.log(`N[${j}] = ${arr[j]}`);
}
