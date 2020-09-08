algoritmo "soma dois numeros"
// Função : Somar dois numeros digitados
// Autor :   João vagner
// Data : 06/04/2020
// Seção de Declarações 
var

numero_1,numero_2,soma: inteiro
nome: caracter

inicio
// Seção de Comandos 
escreva( "digite seu nome por favor " )
leia(nome)

escreva(nome, " digite o numero 1 : ")
leia (numero_1)

se (numero_1 = 0) entao
   escreval (" o numero não pode ser nulo")
fimse

escreva( nome, " digite o numero 2 : ")
leia(numero_2)

soma <- numero_1 + numero_2

escreva (nome, " a sua soma eh : ", soma)

fimalgoritmo
