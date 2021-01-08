var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let flag = 0, nota, media = 0;

do {
    nota = parseFloat(lines.shift());

    let repetir = 0;

    if (nota >= 0 && nota <= 10) {
        media += nota;
        flag++;
    } else console.log("nota invalida");

    if (flag == 2) {
        media = media / 2;
        console.log(`media = ${media.toFixed(2)}`);

        while (repetir != 1 && repetir != 2) {
            console.log("novo calculo (1-sim 2-nao)");
            repetir = parseInt(lines.shift());

            if (repetir == 1) {
                flag = 0;
                media = 0;
            }
        }
    }
} while (flag != 2);
