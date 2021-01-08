var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

const n = parseInt(lines.shift());
let f1 = 0, f2 = 1, f3 = 0, str = "";

if (n === 1) {
    console.log(`${f1}`);
} else if (n === 2) {
    console.log(`${f1} ${f2}`);
} else if (n >= 3) {
    str += `${f1} ${f2} `;
    
    for (let i = 2; i < n; i++) {
        f3 = f1 + f2;
        str += `${f3} `;
        f1 = f2;
        f2 = f3;
    }

    str = str.replace(/\s?$/,'');

    console.log(str);
}
