var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

for (let i = 1001; i <= 9999; i++) {
    let senha = parseInt(lines.shift());
        
    console.log(senha - 1);
}
