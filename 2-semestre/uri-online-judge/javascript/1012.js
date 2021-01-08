var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let linha = lines.shift().split(" ");
let a = parseFloat(linha[0]);
let b = parseFloat(linha[1]);
let c = parseFloat(linha[2]);

let areaTri = (a * c) / 2;
let areaCir = (3.14159 * c * c);
let areaTra = ((a + b) * c) / 2;
let areaQua = b * b;
let areaRet = a * b;

console.log("TRIANGULO: " + areaTri.toFixed(3));
console.log("CIRCULO: " + areaCir.toFixed(3));
console.log("TRAPEZIO: " + areaTra.toFixed(3));
console.log("QUADRADO: " + areaQua.toFixed(3));
console.log("RETANGULO: " + areaRet.toFixed(3));
