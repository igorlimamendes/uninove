var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let valores = [];
let maior = 0;
let posicao = 0;
let aux = 0;

for (let i = 0; i < 100; i++) {
    valores.push(parseInt(lines.shift()));

    if (valores[i] > aux) {
        maior = valores[i];
        posicao = i+1;
        aux = valores[i];
    }
}

console.log(`${maior}\n${posicao}`);
