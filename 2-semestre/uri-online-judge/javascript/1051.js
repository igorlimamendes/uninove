var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let valor = parseFloat(lines.shift());
let aux = 0;
let imposto = 0;

if (valor > 0 && valor <= 2000) {
    console.log("Isento");
} else if (valor > 2000 && valor <= 3000) {
    aux = valor - 2000;
    imposto = aux * 0.08;

    console.log("R$ " + imposto.toFixed(2));
} else if (valor > 3000 && valor <= 4500) {
    aux = valor - 3000;
    imposto = aux * 0.18 + 1000 * 0.08;

    console.log("R$ " + imposto.toFixed(2));
} else {
    aux = valor - 4500;
    imposto = aux * 0.28 + 1500 * 0.18 + 1000 * 0.08;

    console.log("R$ " + imposto.toFixed(2));
}
