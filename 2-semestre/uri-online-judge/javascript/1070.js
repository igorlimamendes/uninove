var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let x = parseInt(lines.shift());

for (let i = x; i < x + 12; i++) {
    if (i % 2 == 1) console.log(i);
}
