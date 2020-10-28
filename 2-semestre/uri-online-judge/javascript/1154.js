var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let flag = false, idade, total = 0, contador = 0;

while (flag === false) {
    idade = parseInt(lines.shift());

    if (idade < 0) {
        flag = true;
    } else {
        total += idade;
        contador++;
    }
}

total /= contador;

console.log(`${total.toFixed(2)}`);
