algoritmo "zero, positivo ou negativo"
// Fun��o : Ler um n�mero e mostrar se � igual a zero, positivo ou negativo
// Autor : Igor
// Data : 06/04/2020
// Se��o de Declara��es
var
valor: real
inicio
escreva("Informe um valor: ")
leia(valor)

se (valor < 0) entao
   escreva("Menor que 0")
senao
   se (valor > 0) entao
      escreva("Maior que 0")
   senao
      escreva("Igual a 0")
   fimse
fimse
fimalgoritmo
