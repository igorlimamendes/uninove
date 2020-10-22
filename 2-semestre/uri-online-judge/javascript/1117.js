var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let contagem = 0, media = 0;

while (contagem != 2) {
    let nota = parseFloat(lines.shift());

    if (nota >= 0 && nota <= 10) {
        media += nota;
        contagem++;
    } else console.log("nota invalida");

    if (contagem === 2) console.log(`media = ${media/2}`);
}
