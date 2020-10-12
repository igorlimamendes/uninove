var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let valores = [];
let valorPar = 0;
let valorImp = 0;
let valorPos = 0;
let valorNeg = 0;

for (let i = 0; i < 5; i++) {
    valores[i] = parseInt(lines.shift());
    
    if (valores[i] % 2 === 0) valorPar++;
    if (valores[i] % 2 !== 0) valorImp++;
    if (valores[i] > 0) valorPos++;
    if (valores[i] < 0) valorNeg++;
}

console.log(`${valorPar} valor(es) par(es)\n${valorImp} valor(es) impar(es)\n${valorPos} valor(es) positivo(s)\n${valorNeg} valor(es) negativo(s)`);
