var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let arr = [];

for (let i = 19; i >= 0; i--) {
    arr[i] = parseInt(lines.shift());
}

for (let j = 0; j < 20; j++) {
    console.log(`N[${j}] = ${arr[j]}`);
}
