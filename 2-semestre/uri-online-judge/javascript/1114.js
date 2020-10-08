var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let senha = 0;

do {
    senha = parseInt(lines.shift());
    
    senha != 2002 ? console.log("Senha Invalida") : console.log("Acesso Permitido");
} while (senha != 2002);
