var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let n = parseInt(lines.shift());

let totCoe = 0;
let totRat = 0;
let totSap = 0;

for (let i = 0; i < n; i++) {
    const linha = lines.shift();
    
    if (linha.includes('C')) totCoe += parseInt(linha.slice(0, 2));
    if (linha.includes('R')) totRat += parseInt(linha.slice(0, 2));
    if (linha.includes("S")) totSap += parseInt(linha.slice(0, 2));
}

let totCob = totCoe + totRat + totSap;

console.log(`Total: ${totCob} cobaias\nTotal de coelhos: ${totCoe}\nTotal de ratos: ${totRat}\nTotal de sapos: ${totSap}`);
console.log(`Percentual de coelhos: ${((totCoe * 100) / totCob).toFixed(2)} %`);
console.log(`Percentual de ratos: ${((totRat * 100) / totCob).toFixed(2)} %`);
console.log(`Percentual de sapos: ${((totSap * 100) / totCob).toFixed(2)} %`);
