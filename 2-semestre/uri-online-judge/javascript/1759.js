var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let valor = parseInt(lines.shift());

console.log("Ho ".repeat(valor).trim() + "!");
