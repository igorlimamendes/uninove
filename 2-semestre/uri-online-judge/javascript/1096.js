var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

for (let i = 1; i <= 9; i += 2) {
    let j = 7;
    console.log(`I=${i} J=${j}`);
    j--;
    console.log(`I=${i} J=${j}`);
    j--;
    console.log(`I=${i} J=${j}`);
    j--;
}
