var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let linha = lines.shift().split(" ");

let n1 = parseFloat(linha[0]);
let n2 = parseFloat(linha[1]);
let n3 = parseFloat(linha[2]);
let n4 = parseFloat(linha[3]);

let media = (n1 * 2 + n2 * 3 + n3 * 4 + n4 * 1) / 10;

if (media >= 7.0) {
    console.log("Media: " + media.toFixed(1));
    console.log("Aluno aprovado.");
} else if (media >= 5.0 && media <= 6.9) {
    let novaLinha = lines.shift().split(" ");
    let n5 = parseFloat(novaLinha[0]);
    
    console.log("Media: " + media.toFixed(1));
    console.log("Aluno em exame.");
    console.log("Nota do exame: " + n5.toFixed(1));
    
    media = (media + n5) / 2;
    
    if (media >= 5.0) {
        console.log("Aluno aprovado.");
    } else {
        console.log("Aluno reprovado.");
    }
    
    console.log("Media final: " + media.toFixed(1));
    
} else {
    console.log("Media: " + media.toFixed(1));
    console.log("Aluno reprovado.");
}
