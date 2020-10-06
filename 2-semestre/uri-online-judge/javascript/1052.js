var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let valor = parseInt(lines.shift());

if (valor === 1) console.log("January");
if (valor === 2) console.log("February");
if (valor === 3) console.log("March");
if (valor === 4) console.log("April");
if (valor === 5) console.log("May");
if (valor === 6) console.log("June");
if (valor === 7) console.log("July");
if (valor === 8) console.log("August");
if (valor === 9) console.log("September");
if (valor === 10) console.log("October");
if (valor === 11) console.log("November");
if (valor === 12) console.log("December");
