algoritmo "calcular nota"
// Fun��o : Desenvolvedor um algoritmo que calcula a m�dia das notas do aluno (4 notas)
// Acrescentar a este algoritmo a mensagem de aprovado e reprovado caso a nota for menor que 6.0
// Melhorar este algoritmo para que o n�mero de notas for vari�vel
// Autor : Igor
// Data : 06/04/2020
// Se��o de Declara��es 
var
notas: vetor[1..4] de real
media: real
i: inteiro
inicio
para i de 1 ate 4 faca
     escreva(i, "� nota: ")
     leia(notas[i])
     media := media + notas[i]
fimpara

escreval()
escreval("Nota final: ", media / 4)

se (media >= 6) entao
   escreva("Situa��o: Aprovado(a)!")
senao
   escreva("Situa��o: Reprovado(a)!")
fimse
fimalgoritmo
