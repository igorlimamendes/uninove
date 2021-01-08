var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let linha = lines.shift().split(" ");

let x = parseFloat(linha[0]);
let y = parseFloat(linha[1]);

if (x === 0 && y === 0) console.log("Origem");
if (x === 0 && y !== 0) console.log("Eixo Y");
if (x !== 0 && y === 0) console.log("Eixo X");
if (x > 0 && y > 0) console.log("Q1");
if (x < 0 && y > 0) console.log("Q2");
if (x < 0 && y < 0) console.log("Q3");
if (x > 0 && y < 0) console.log("Q4");
