var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let n = parseInt(lines.shift());
let i = 0;

while (i < n) {
    let linha = lines.shift().split(" ");
    let x = parseInt(linha[0]);
    let y = parseInt(linha[1]);
    let soma = 0;

    if (x < y) {
        for (let aux = x+1; aux < y; aux++) {
            if (aux % 2 !== 0) soma += aux;
        }
    } else {
        for (let aux = y+1; aux < x; aux++) {
            if (aux % 2 !== 0) soma += aux;
        }
    }

    console.log(soma);

    i++;
}
