var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let x = parseInt(lines.shift());
let y = parseInt(lines.shift());
let soma = 0;

if (x < y) {
    for (let i = x; i <= y; i++) {
        if (i % 13 !== 0) soma += i;
    }
} else {
    for (let i = y; i <= x; i++) {
        if (i % 13 !== 0) soma += i;
    }
}

console.log(soma);
