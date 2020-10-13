var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

const n = parseInt(lines.shift());
let val1 = 0;
let val2 = 0;
let val3 = 0;
let media = 0;

for (let i = 0; i < n; i++) {
    let linha = lines.shift().split(" ");

    val1 = parseFloat(linha[0]);
    val2 = parseFloat(linha[1]);
    val3 = parseFloat(linha[2]);

    media = (val1 * 2 + val2 * 3 + val3 * 5) / 10;

    console.log(media.toFixed(1));
}
