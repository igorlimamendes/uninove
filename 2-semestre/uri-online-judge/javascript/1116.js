var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let n = parseInt(lines.shift());
let x, y, z = 0;

for (let i = 0; i < n; i++) {
    let linha = lines.shift().split(" ");
    
    x = parseInt(linha[0]);
    y = parseInt(linha[1]);
    
    if (y === 0) {
        console.log("divisao impossivel");
    } else {
        z = x / y;
        console.log(`${z.toFixed(1)}`);
    }
}
