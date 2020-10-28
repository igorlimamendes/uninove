var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let x, z, s = 0, c = 0, flag = false;

x = parseInt(lines.shift());
z = parseInt(lines.shift());

while (z <= x) z = parseInt(lines.shift());

while (flag === false) {
    s += x;
    x++;
    c++;

    if (s > z) flag = true;
}

console.log(`${c}`);
