var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let n = parseInt(lines.shift());

for (let i = 0; i < n; i++) {
    let seguinte = parseInt(lines.shift());
    
    if (seguinte === 0) console.log("NULL");
    else if (seguinte % 2 === 0 && seguinte > 0) console.log("EVEN POSITIVE");
    else if (seguinte % 2 === 0 && seguinte < 0) console.log("EVEN NEGATIVE");
    else if (seguinte % 2 !== 0 && seguinte > 0) console.log("ODD POSITIVE");
    else if (seguinte % 2 !== 0 && seguinte < 0) console.log("ODD NEGATIVE");
}
