var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

for (let i = 0; i <= 2; i += 0.2) {
    for (let j = 1; j <= 3; j++) {
        if (i.toFixed(1).endsWith("0")) {
            console.log(`I=${i.toFixed(0)} J=${(i + j).toFixed(0)}`);
        } else {
            console.log(`I=${i.toFixed(1)} J=${(i + j).toFixed(1)}`);
        }
    }
}
