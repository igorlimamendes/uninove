var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let linha = lines.shift().split(" ");

let a = parseInt(linha[0]);
let b = parseInt(linha[1]);

if (a > b) {
    if (a % b === 0) console.log("Sao Multiplos");
    else console.log("Nao sao Multiplos");
} else {
    if (b % a === 0) console.log("Sao Multiplos");
    else console.log("Nao sao Multiplos");
}
