var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let linha = lines.shift().split(" ");

a = parseInt(linha[0]);
b = parseInt(linha[1]);
c = parseInt(linha[2]);

if (a < b && a < c) {
    console.log(a);
    
    if (b < c) {
        console.log(b);
        console.log(c);
    } else {
        console.log(c);
        console.log(b);
    }
} else if (b < a && b < c) {
    console.log(b);
        
    if (a < c) {
        console.log(a);
        console.log(c);
    } else {
        console.log(c);
        console.log(a);
    }
} else {
    console.log(c);
        
    if (a < b) {
        console.log(a);
        console.log(b);
    } else {
        console.log(b);
        console.log(a);
    }
}
    
console.log("");

console.log(a);
console.log(b);
console.log(c);
