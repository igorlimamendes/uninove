var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

do {
    let linha = lines.shift().split(" ");
    m = parseInt(linha[0]);
    n = parseInt(linha[1]);
    let soma = 0;
    let array = [];

    if (m > 0 && n > 0) {
        if (m < n) {
            for (let i = m; i <= n; i++) {
                array.push(i);
                soma += i;
            }
        } else {
            for (let i = n; i <= m; i++) {
                array.push(i);
                soma += i;
            }
        }

        console.log(`${array.join(" ")} Sum=${soma}`);
    }
} while (m > 0 && n > 0);
