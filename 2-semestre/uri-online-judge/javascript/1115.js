var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

do {
    let linha = lines.shift().split(" ");
    x = parseInt(linha[0]);
    y = parseInt(linha[1]);

    if (x === 0 || y === 0) break;
    else if (x > 0 && y > 0) console.log("primeiro");
    else if (x < 0 && y > 0) console.log("segundo");
    else if (x < 0 && y < 0) console.log("terceiro");
    else console.log("quarto");
} while (x !== 0 && y !== 0);
