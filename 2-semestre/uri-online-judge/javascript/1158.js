var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

const n = parseInt(lines.shift());

let linhas, x, y, s;

for (let i = 0; i < n; i++) {
    linhas = lines.shift().split(" ");
    x = parseInt(linhas[0]);
    y = parseInt(linhas[1]);

    s = 0;

    for (let i = 0; i < y; i++) {
        if (x % 2 !== 0) s += x;
        else s += x+1;
        
        x += 2;
    }

    console.log(`${s}`);
}
