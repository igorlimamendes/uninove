var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let linha = lines.shift().split(" ");

let a = parseFloat(linha[0]);
let b = parseFloat(linha[1]);
let c = parseFloat(linha[2]);

if ((a < b + c) && (b < a + c) && (c < a + b)) {
    let perimetro = a + b + c;
    
    console.log("Perimetro = " + perimetro.toFixed(1));
} else {
    let trapezio = ((a + b) * c) / 2;
    
    console.log("Area = " + trapezio.toFixed(1));
}
