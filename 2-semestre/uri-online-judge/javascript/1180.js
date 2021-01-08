var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

const n = parseInt(lines.shift());
const x = lines.shift().split(" ").map(Number);
const m = Math.min(...x);

console.log(`Menor valor: ${m}\nPosicao: ${x.indexOf(m)}`);
