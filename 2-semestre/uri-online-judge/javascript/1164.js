var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let n, x, s;

n = parseInt(lines.shift());

for (let i = 0; i < n; i++) {
    x = parseInt(lines.shift());

    s = 0;

    for (let j = 1; j < x; j++) {
        if (x % j === 0) s += j;
    }

    if (s === x) console.log(`${x} eh perfeito`);
    else console.log(`${x} nao eh perfeito`);
}
