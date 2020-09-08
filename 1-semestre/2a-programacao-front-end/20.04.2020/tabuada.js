// arquivo tabuada.js
function mostrarTexto(texto) {
  document.getElementById("resultado").innerHTML = texto;
}

function executar_tabuada(numero) {

  var resultado = 0;
  var linha_final="";
 
  for (var i=10; i>=1; i--) {
    resultado = numero * i ;
      //var linha = "" + i + "x" + numero + "=" + resultado + "<br>";
	  var linha = "" + numero + "x" + i + "=" + resultado + "<br>";
	  linha_final+=linha; // linha_final= linha_final+linha
    }

	mostrarTexto(linha_final);
}
/* assim fica a linha_final
1x2=2<br>2x2=4<br>3x2=6<br>4x2=8<br>5x2=10<br>6x2=12<br>7x2=14
8x2=16<br>9x2=18<br>10x2=20<br>
*/