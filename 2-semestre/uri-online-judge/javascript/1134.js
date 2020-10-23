var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let fim = 0, alc = 0, gas = 0, die = 0;

do {
    let painel = parseInt(lines.shift());

    if (painel === 1) alc++;
    else if (painel == 2) gas++;
    else if (painel == 3) die++;
    else if (painel == 4) fim = 4;
} while (fim != 4);

console.log(`MUITO OBRIGADO\nAlcool: ${alc}\nGasolina: ${gas}\nDiesel: ${die}`);
