var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let linha = lines.shift().split(" ");

let horaIni = parseInt(linha[0]);
let minuIni = parseInt(linha[1]);
let horaFim = parseInt(linha[2]);
let minuFim = parseInt(linha[3]);

let inicio = (horaIni * 60) + minuIni;
let fim = (horaFim * 60) + minuFim;

let diferenca = fim - inicio;

if (diferenca <= 0) {
    let x = ((24 * 60) + diferenca);
    
    console.log(`O JOGO DUROU ${parseInt(x / 60)} HORA(S) E ${x % 60} MINUTO(S)`);
} else {
    console.log(`O JOGO DUROU ${parseInt(diferenca / 60)} HORA(S) E ${diferenca % 60} MINUTO(S)`);
}
