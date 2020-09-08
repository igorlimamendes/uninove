algoritmo "calcular nota"
// Função : Desenvolvedor um algoritmo que calcula a média das notas do aluno (4 notas)
// Acrescentar a este algoritmo a mensagem de aprovado e reprovado caso a nota for menor que 6.0
// Melhorar este algoritmo para que o número de notas for variável
// Autor : Igor
// Data : 06/04/2020
// Seção de Declarações 
var
notas: vetor[1..4] de real
media: real
i: inteiro
inicio
para i de 1 ate 4 faca
     escreva(i, "ª nota: ")
     leia(notas[i])
     media := media + notas[i]
fimpara

escreval()
escreval("Nota final: ", media / 4)

se (media >= 6) entao
   escreva("Situação: Aprovado(a)!")
senao
   escreva("Situação: Reprovado(a)!")
fimse
fimalgoritmo
