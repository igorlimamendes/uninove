var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

do {
    let linha = lines.shift().split(" ");
    x = parseInt(linha[0]);
    y = parseInt(linha[1]);

    if (x == y) break;
    else if (x < y) console.log("Crescente");
    else console.log("Decrescente");
} while (x != y);
