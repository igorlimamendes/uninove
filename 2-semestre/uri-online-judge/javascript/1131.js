var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let reset = 1, totJo = 0, totEm = 0, totIn = 0, totGr = 0;

do {
    let linha = lines.shift().split(" ");

    let golIn = parseInt(linha[0]);
    let golGr = parseInt(linha[1]);

    totJo++;
    if (golIn === golGr) totEm++;
    else if (golIn < golGr) totGr++;
    else totIn++;

    console.log("Novo grenal (1-sim 2-nao)");
    reset = parseInt(lines.shift());

    if (reset === 2) {
        console.log(`${totJo} grenais\nInter:${totIn}\nGremio:${totGr}\nEmpates:${totEm}`);

        if (totIn === totGr) console.log("Nao houve vencedor");
        else if (totIn < totGr) console.log("Gremio venceu mais");
        else console.log("Inter venceu mais");
    }
} while (reset === 1);
