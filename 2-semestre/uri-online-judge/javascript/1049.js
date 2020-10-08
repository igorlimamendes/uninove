var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let palavra1 = lines.shift();
let palavra2 = lines.shift();
let palavra3 = lines.shift();

if (palavra1.localeCompare("vertebrado") === 0) {
    if (palavra2.localeCompare("ave") === 0) {
        if (palavra3.localeCompare("carnivoro") === 0) {
            console.log("aguia");
        } else if (palavra3.localeCompare("onivoro") === 0) {
            console.log("pomba");
        }
    } else if (palavra2.localeCompare("mamifero") === 0) {
        if (palavra3.localeCompare("onivoro") === 0) {
            console.log("homem");
        } else if (palavra3.localeCompare("herbivoro") === 0) {
            console.log("vaca");
        }
    }
} else if (palavra1.localeCompare("invertebrado") === 0) {
    if (palavra2.localeCompare("inseto") === 0) {
        if (palavra3.localeCompare("hematofago") === 0) {
            console.log("pulga");
        } else if (palavra3.localeCompare("herbivoro") === 0) {
            console.log("lagarta");
        }
    } else if (palavra2.localeCompare("anelideo") === 0) {
        if (palavra3.localeCompare("hematofago") === 0) {
            console.log("sanguessuga");
        } else if (palavra3.localeCompare("onivoro") === 0) {
            console.log("minhoca");
        }
    }
}
