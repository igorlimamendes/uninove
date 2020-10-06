var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let linha = lines.shift().split(" ");

let horaIni = parseInt(linha[0]);
let horaFim = parseInt(linha[1]);

let total = 0;

if (horaIni == horaFim) {
    total = 24;
} else if (horaIni < horaFim) {
    total = horaFim - horaIni;
} else {
    total = 24 - horaIni + horaFim;
}

console.log("O JOGO DUROU " + total + " HORA(S)");
