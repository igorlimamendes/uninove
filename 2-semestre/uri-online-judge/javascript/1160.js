var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

const t = parseInt(lines.shift());

for (let i = 0; i < t; i++) {
    const linha = lines.shift().split(' ');
    
    let pa = parseInt(linha[0]);
    let pb = parseInt(linha[1]);
    const g1 = parseFloat(linha[2]) / 100;
    const g2 = parseFloat(linha[3]) / 100;

    let anos = 1;

    for (let j = 0; j < 100; j++, anos++) {
        pa += parseInt(pa * g1);
        pb += parseInt(pb * g2);

        if (pa > pb) break;
    }

    if (anos > 100) console.log(`Mais de 1 seculo.`);
    else console.log(`${anos} anos.`);
}
