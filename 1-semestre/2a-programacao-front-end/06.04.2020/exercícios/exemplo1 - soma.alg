algoritmo "soma dois numeros"
// Fun��o : Somar dois numeros digitados
// Autor :   Jo�o vagner
// Data : 06/04/2020
// Se��o de Declara��es 
var

numero_1,numero_2,soma: inteiro
nome: caracter

inicio
// Se��o de Comandos 
escreva( "digite seu nome por favor " )
leia(nome)

escreva(nome, " digite o numero 1 : ")
leia (numero_1)

se (numero_1 = 0) entao
   escreval (" o numero n�o pode ser nulo")
fimse

escreva( nome, " digite o numero 2 : ")
leia(numero_2)

soma <- numero_1 + numero_2

escreva (nome, " a sua soma eh : ", soma)

fimalgoritmo
