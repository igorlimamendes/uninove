var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

const linha = lines.shift().split(" ");
const x = parseInt(linha[0]);
const y = parseInt(linha[1]);

let cont = 1;
let result = "";

for (let i = 1; i <= y; i++) {
    if (cont !== x) {
        result += i + " ";
        cont++;
    } else {
        result += i + "\n";
        cont = 1;
    }
}

result = result.replace(/^\s+|\s+$/g, '');

console.log(result);
