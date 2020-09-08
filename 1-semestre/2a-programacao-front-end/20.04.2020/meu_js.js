var num = 0;

function add() {
	//num++;  // num = num + 1;
	num=num+5;  // num+=5;
	mostrar(num);
}
function sub() {
	//num--;  // num = num - 1 ;
	num=num-3;  //num-=3;
	mostrar(num);
}
function mostrar(valor) {
	document.getElementById("resultado").innerHTML = valor;
}