var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let x = parseInt(lines.shift());
let y = parseInt(lines.shift());
let soma = 0;

if (x < y) {
    for (let i = x+1; i < y; i++) {
        if (i % 2 !== 0) soma += i;
    }
} else {
    for (let i = y+1; i < x; i++) {
        if (i % 2 !== 0) soma += i;
    }
}

console.log(soma);
