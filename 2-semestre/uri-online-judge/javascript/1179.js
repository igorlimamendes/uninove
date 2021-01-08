var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let arrPar = [], contPar = 0, arrImp = [], contImp = 0;

for (let i = 0; i < 15; i++) {
    const valor = parseInt(lines.shift());

    if (valor % 2 === 0) {
        arrPar[contPar] = valor;
        contPar++;
    } else {
        arrImp[contImp] = valor;
        contImp++;
    }

    if (contPar === 5) {
        contPar = 0;

        for (let j = 0; j < 5; j++) {
            console.log(`par[${j}] = ${arrPar[j]}`);
        }
    } else if (contImp === 5) {
        contImp = 0;
        
        for (let j = 0; j < 5; j++) {
            console.log(`impar[${j}] = ${arrImp[j]}`);
        }
    }
}

for (let i = 0; i < contImp; i++) {
    console.log(`impar[${i}] = ${arrImp[i]}`);
}

for (let i = 0; i < contPar; i++) {
    console.log(`par[${i}] = ${arrPar[i]}`);
}
