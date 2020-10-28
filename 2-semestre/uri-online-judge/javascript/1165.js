var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let n, x, c;

n = parseInt(lines.shift());

for (let i = 0; i < n; i++) {
    x = parseInt(lines.shift());

    c = 0;

    for (let j = 1; j <= x; j++) {
        if (x % j === 0) c++;
    }

    if (c === 2) console.log(`${x} eh primo`);
    else console.log(`${x} nao eh primo`);
}
