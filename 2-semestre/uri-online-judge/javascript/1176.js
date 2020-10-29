var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

const t = parseInt(lines.shift());

for (let i = 0; i < t; i++) {
    let n = parseInt(lines.shift());

    let f1 = 0, f2 = 1, f3 = 0;

    if (n === 0) {
        console.log(`Fib(${n}) = ${f1}`);
    } else if (n === 1) {
        console.log(`Fib(${n}) = ${f2}`);
    } else if (n >= 2) {
        for (let j = 2; j <= n; j++) {
            f3 = f1 + f2;
            if (j === n) console.log(`Fib(${n}) = ${f3}`);
            f1 = f2;
            f2 = f3;
        }
    }
}
