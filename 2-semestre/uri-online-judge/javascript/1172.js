var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let array = [];

for (let i = 0; i < 10; i++) {
    array.push(parseInt(lines.shift()));

    if (array[i] <= 0) array[i] = 1;
}

for (let i = 0; i < 10; i++) {
    console.log(`X[${i}] = ${array[i]}`);
}
