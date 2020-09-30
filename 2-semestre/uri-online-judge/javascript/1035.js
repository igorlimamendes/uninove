var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let linha = lines.shift().split(" ");

let a = parseInt(linha[0]);
let b = parseInt(linha[1]);
let c = parseInt(linha[2]);
let d = parseInt(linha[3]);

if (b > c && d > a && c + d > a + b && c > 0 && d > 0 && a % 2 === 0) {
    console.log("Valores aceitos");
} else {
    console.log("Valores nao aceitos");
}
