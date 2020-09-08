algoritmo "zero, positivo ou negativo"
// Função : Ler um número e mostrar se é igual a zero, positivo ou negativo
// Autor : Igor
// Data : 06/04/2020
// Seção de Declarações
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
