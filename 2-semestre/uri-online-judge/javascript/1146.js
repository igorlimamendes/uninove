var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let x = parseInt(lines.shift());

while (x !== 0) {
    let string = "";

    for (let i = 1; i <= x; i++) {
        if (i !== x) string += i + " ";
        else string += i;
    }
    
    x = parseInt(lines.shift());

    console.log(string);
}
