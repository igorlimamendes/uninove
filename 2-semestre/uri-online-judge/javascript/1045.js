var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let linha = lines.shift().split(" ");

let a = parseFloat(linha[0]);
let b = parseFloat(linha[1]);
let c = parseFloat(linha[2]);

let ladoA = 0;
let ladoB = 0;
let ladoC = 0;

if (a >= b && a >= c) {
    ladoA = a;
        
    if (b >= c) {
        ladoB = b;
        ladoC = c;
    } else {
        ladoB = c;
        ladoC = b;
    }
} else if (b >= a && b >= c) {
    ladoA = b;
    
    if (a >= c) {
        ladoB = a;
        ladoC = c;
    } else {
        ladoB = c;
        ladoC = a;
    }
} else {
    ladoA = c;
    
    if (a >= b) {
        ladoB = a;
        ladoC = b;
    } else {
        ladoB = b;
        ladoC = a;
    }
}

if (ladoA >= (ladoB + ladoC)) {
    console.log("NAO FORMA TRIANGULO")
} else if (ladoA * ladoA > ladoB * ladoB + ladoC * ladoC) {
    console.log("TRIANGULO OBTUSANGULO");
}
    
if (ladoA * ladoA == ladoB * ladoB + ladoC * ladoC) console.log("TRIANGULO RETANGULO");
if (ladoA * ladoA < ladoB * ladoB + ladoC * ladoC) console.log("TRIANGULO ACUTANGULO");
if (ladoA == ladoB && ladoB == ladoC) console.log("TRIANGULO EQUILATERO");
if (ladoA == ladoB && ladoA != ladoC || ladoA == ladoC && ladoA != ladoB || ladoB == ladoC && ladoB != ladoA) console.log("TRIANGULO ISOSCELES");
