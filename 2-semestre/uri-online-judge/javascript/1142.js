var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let n = parseInt(lines.shift());
let x = 1;

for (let i = 0; i < n; i++) {
    console.log(`${x} ${x+1} ${x+2} PUM`);

    x += 4;
}
