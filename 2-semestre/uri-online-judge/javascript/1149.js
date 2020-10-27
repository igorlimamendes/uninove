var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

const linha = lines.shift().split(" ");

let a = parseInt(linha[0]);
let n = parseInt(linha[1]);
let i = 1;
let s = 0;

while (n <= 0) {
    n = parseInt(linha[i]);
    i++;
}

for (let i = 1; i <= n; i++) {
    s += a;
    a++;
}

console.log(s);
