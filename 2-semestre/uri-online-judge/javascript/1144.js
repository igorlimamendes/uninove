var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

const n = parseInt(lines.shift());
let quad;
let cubo;

for (let i = 1; i <= n; i++) {
    quad = Math.pow(i, 2);
    cubo = Math.pow(i, 3);

    console.log(`${i} ${quad} ${cubo}`);

    quad++;
    cubo++;
    
    console.log(`${i} ${quad} ${cubo}`);
}
