var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let flag = false, x, s;

while (flag === false) {
    x = parseInt(lines.shift());

    s = 0;

    if (x !== 0) {
        for (let i = 0; i < 5; i++) {
            if (x % 2 === 0) s += x;
            else s += x+1;

            x += 2;
        }

        console.log(`${s}`);
    } else flag = true;
}
